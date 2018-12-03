//
//  TSUtils.swift
//  HuaXia
//
//  Created by tianshui on 15/11/2.
// 
//

import Foundation
import CoreGraphics

/// 工具 静态方法
final class TSUtils {
    
    /**
    判断一个字符串是否是手机号
    - parameter phone: 字符串
    - returns: bool
    */
    static func isPhone(_ phone: String?) -> Bool {
        guard let phone = phone else {
            return false
        }
        
        let pattern = "^1\\d{10}$"
        guard let regexp = try? NSRegularExpression(pattern: pattern, options: .caseInsensitive) else {
            return false
        }
        
        let range = NSMakeRange(0, phone.count)
        let num = regexp.numberOfMatches(in: phone, options: NSRegularExpression.MatchingOptions.reportProgress, range: range)
        if num <= 0 {
            return false
        }
        return true
    }
    
    /**
     判断一个字符串是否是邮箱
     - parameter email: 邮箱
     - returns: bool
     */
    static func isEmail(_ email: String?) -> Bool {
        guard let email = email , email.count >= 6 else {
            return false
        }
        
        let pattern = "^[\\w\\-\\.]+@[\\w\\-]+(\\.\\w+)+$"
        guard let regexp = try? NSRegularExpression(pattern: pattern, options: .caseInsensitive) else {
            return false
        }
        
        let range = NSMakeRange(0, email.count)
        let num = regexp.numberOfMatches(in: email, options: NSRegularExpression.MatchingOptions.reportProgress, range: range)
        if num <= 0 {
            return false
        }
        return true
    }
    
    /**
    时间戳转字符串
    - parameter timestamp:     时间戳
    - parameter format:        格式
    - parameter isIntelligent: 是否智能转换(true:时间小于24小时显示n秒前,n分钟前等, false:按照format格式转换)
    - returns: 按格式转换后的字符串
    */
    static func timestampToString(_ timestamp: TimeInterval, withFormat format: String = "yyyy-MM-dd HH:mm:ss", isIntelligent: Bool = false) -> String {
        
        if timestamp < 0 {
            return ""
        }
        
        var format = format
        
        if isIntelligent {
            let now = Foundation.Date().timeIntervalSince1970
            let diff = now - timestamp
            if diff < 1 {
                return "刚刚"
            } else if diff < 60 {
                let r = Int(diff)
                return "\(r)秒前"
            } else if diff < 60 * 60 {
                let r = Int(diff / 60)
                return "\(r)分前"
            } else if diff < 60 * 60 * 24 {
                let r = Int(diff / 60 / 60)
                return "\(r)小时前"
            } else if diff < 60 * 60 * 24 * 2 {
                format = "昨天 HH:mm"
            } else if diff < 60 * 60 * 24 * 3 {
                format = "前天 HH:mm"
            }
        }
        
        let formatter = DateFormatter()
        formatter.dateFormat = format
        return formatter.string(from: Foundation.Date(timeIntervalSince1970: timestamp))
    }
    
    /// 字符串转时间
    ///
    /// - Parameters:
    ///   - str: 字符串
    ///   - format: 字符串格式
    /// - Returns: Date
    static func stringToTimestamp(string: String, withFormat format: String = "yyyy-MM-dd HH:mm:ss") -> Foundation.Date? {
        let formatter = DateFormatter()
        formatter.dateFormat = format
        return formatter.date(from: string)
    }
    
    /**
     生成一个随机字符串(a-zA-Z0-9)
     - parameter length: 字符串长度
     - returns: 随机字符串
     */
    static func randomString(length: Int = 32) -> String {
        
        func generate(start: UnicodeScalar, end: UnicodeScalar) -> [String] {
            var chars: [String] = []
            
            for ascii in start.value...end.value {
                if let scalar = UnicodeScalar(ascii) {
                    let char = Character(scalar)
                    chars.append("\(char)")
                }
            }
            return chars
        }
        
        var chars: [String] = []
        chars += generate(start: "a", end: "z")
        chars += generate(start: "A", end: "Z")
        chars += generate(start: "0", end: "9")
        
        var output = ""
        for _ in 0..<length {
            let randomNum = Int(arc4random() % UInt32(chars.count))
            output += chars[randomNum]
        }
        
        return output
    }
}
