//
//  UserInfoModel.swift
//  IULiao
//
//  Created by tianshui on 2017/6/27.
//  Copyright © 2017年 ShangHai Lianbozhongying Network Technology Co., Ltd. All rights reserved.
//

import Foundation
import SwiftyJSON


/// 用户信息
struct UserInfoModel: BaseModelProtocol {
    
    var json: JSON
    
    /// 用户id
    var id: Int
    
    var userID: Int  {
        return id
    }
    
    /// 昵称
    var nickname: String
    
    /// 手机
    var phone: String
    
    /// 中间加 * 号的手机号
    var secretPhone: String {
        return phone[0..<3] + "****" + phone[7..<11]
    }
    
    /// 性别
    var gender: UserGenderType
    
    /// 头像
    var avatar: String?

    init(json: JSON) {
        self.json = json
        
        id = json["id"].intValue
        nickname = json["nickname"].stringValue
        phone = json["phone"].stringValue
        gender = UserGenderType(rawValue: json["gender"].intValue) ?? .none
        avatar = json["avatar"].stringValue
    }
    
}

/// 用户性别
enum UserGenderType: Int, CustomStringConvertible{
    
    case male = 1
    
    case female = 2
    
    case none = 0
    
    var description: String {
        switch self {
        case .male: return "男"
        case .female: return "女"
        default: return "保密"
        }
    }
    
    init(description: String) {
        switch description {
        case "男":
            self = .male
        case "女":
            self = .female
        default:
            self = .none
        }
    }
}
