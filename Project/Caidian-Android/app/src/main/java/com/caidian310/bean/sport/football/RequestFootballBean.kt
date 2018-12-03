package com.caidian310.bean.sport.football

import com.caidian310.bean.buy.Bet
import com.google.gson.annotations.SerializedName


/**
 * 网络请求的原始数据格式  需要转换成自己需要的格式
 * Created by mac on 2017/12/4.
 */
data class RequestFootballBean(
        @SerializedName("id") var id: Int,
        @SerializedName("xid") var xid: String,
        @SerializedName("league_full_name") var leagueFullName: String,
        @SerializedName("league_name") var leagueName: String,
        @SerializedName("home") var home: String,
        @SerializedName("away") var away: String,
        @SerializedName("away3") var away3: String,
        @SerializedName("home3") var home3: String,
        @SerializedName("match_time") var matchTime: Long,
        @SerializedName("sale_end_time") var saleEndTime: Long,
        @SerializedName("let_ball") var letBall: Double,
        @SerializedName("color") var color: String,
        @SerializedName("issue") var issue: String,
        @SerializedName("score") var score: String,
        @SerializedName("score_half") var scoreHalf: String,
        @SerializedName("status") var status: Int,
        @SerializedName("check_status") var checkStatus: Int,
        @SerializedName("result_status") var resultStatus: Int,
        var serial: String,
        var bf_sp00: Double,
        var bf_sp01: Double,
        var bf_sp02: Double,
        var bf_sp03: Double,
        var bf_sp04: Double,
        var bf_sp05: Double,
        var bf_sp10: Double,
        var bf_sp11: Double,
        var bf_sp12: Double,
        var bf_sp13: Double,
        var bf_sp14: Double,
        var bf_sp15: Double,
        var bf_sp20: Double,
        var bf_sp21: Double,
        var bf_sp22: Double,
        var bf_sp23: Double,
        var bf_sp24: Double,
        var bf_sp25: Double,
        var bf_sp30: Double,
        var bf_sp31: Double,
        var bf_sp32: Double,
        var bf_sp33: Double,
        var bf_sp40: Double,
        var bf_sp41: Double,
        var bf_sp42: Double,
        var bf_sp50: Double,
        var bf_sp51: Double,
        var bf_sp52: Double,
        var bf_spA0: Double,
        var bf_spA1: Double,
        var bf_spA3: Double,
        var bqc_sp00: Double,
        var bqc_sp01: Double,
        var bqc_sp03: Double,
        var bqc_sp10: Double,
        var bqc_sp11: Double,
        var bqc_sp13: Double,
        var bqc_sp30: Double,
        var bqc_sp31: Double,
        var bqc_sp33: Double,
        var jqs_sp0: Double,
        var jqs_sp1: Double,
        var jqs_sp2: Double,
        var jqs_sp3: Double,
        var jqs_sp4: Double,
        var jqs_sp5: Double,
        var jqs_sp6: Double,
        var jqs_sp7: Double,
        var spf_sp3: Double,
        var spf_sp1: Double,
        var spf_sp0: Double,
        var rqspf_sp3: Double,
        var rqspf_sp1: Double,
        var rqspf_sp0: Double,
        @SerializedName("spf_fixed") var spfFixed: Int,
        @SerializedName("rqspf_fixed") var rqspfFixed: Int,
        @SerializedName("bqc_fixed") var bqcFixed: Int,
        @SerializedName("jqs_fixed") var jqsFixed: Int,
        @SerializedName("bf_fixed") var bfFixed: Int,
        @SerializedName("spf_single") var spfSingle: Int,
        @SerializedName("rqspf_single") var rqspfSingle: Int,
        @SerializedName("bf_single") var bfSingle: Int,
        @SerializedName("bqc_single") var bqcSingle: Int,
        @SerializedName("jqs_single") var jqsSingle: Int,
        @SerializedName("jc_id") var jcId: Int,
       @SerializedName("home_logo") var homeLogo :String,
       @SerializedName("away_logo") var awayLogo :String
)

class FootballHelp {
    /**
     * 创建一个空的对象保存所有的数据
     */
    fun getFootballBean(bean: RequestFootballBean): FootballBean {
        return FootballBean(
                id = bean.id,
                xid = bean.xid,
                leagueFullName = bean.leagueFullName,
                leagueName = bean.leagueName,
                home = bean.home,
                away = bean.away,
                away3 = bean.away3,
                home3 = bean.home3,
                matchTime = bean.matchTime,
                saleEndTime = bean.saleEndTime,
                letBall = bean.letBall,
                color = bean.color,
                issue = bean.issue,
                score = bean.score,
                scoreHalf = bean.scoreHalf,
                status = bean.status,
                checkStatus = bean.checkStatus,
                resultStatus = bean.resultStatus,
                serial = bean.serial,
                jczqBeanList = arrayListOf(
                        BetBean(sp = bean.bf_sp00, key = "bf_sp00", jianChen = "0:0", typeString = "1:0"),
                        BetBean(sp = bean.bf_sp01, key = "bf_sp01", jianChen = "0:1", typeString = "0:1"),
                        BetBean(sp = bean.bf_sp02, key = "bf_sp02", jianChen = "0:2", typeString = "0:2"),
                        BetBean(sp = bean.bf_sp03, key = "bf_sp03", jianChen = "0:3", typeString = "0:3"),
                        BetBean(sp = bean.bf_sp04, key = "bf_sp04", jianChen = "0:4", typeString = "0:4"),
                        BetBean(sp = bean.bf_sp05, key = "bf_sp05", jianChen = "0:5", typeString = "0:5"),
                        BetBean(sp = bean.bf_sp10, key = "bf_sp10", jianChen = "1:0", typeString = "1:0"),
                        BetBean(sp = bean.bf_sp11, key = "bf_sp11", jianChen = "1:1", typeString = "1:1"),
                        BetBean(sp = bean.bf_sp12, key = "bf_sp12", jianChen = "1:2", typeString = "1:2"),
                        BetBean(sp = bean.bf_sp13, key = "bf_sp13", jianChen = "1:3", typeString = "1:3"),
                        BetBean(sp = bean.bf_sp14, key = "bf_sp14", jianChen = "1:4", typeString = "1:4"),
                        BetBean(sp = bean.bf_sp15, key = "bf_sp14", jianChen = "1:5", typeString = "1:5"),
                        BetBean(sp = bean.bf_sp20, key = "bf_sp20", jianChen = "2:0", typeString = "2:0"),
                        BetBean(sp = bean.bf_sp21, key = "bf_sp21", jianChen = "2:1", typeString = "2:1"),
                        BetBean(sp = bean.bf_sp22, key = "bf_sp22", jianChen = "2:2", typeString = "2:2"),
                        BetBean(sp = bean.bf_sp23, key = "bf_sp23", jianChen = "2:3", typeString = "2:3"),
                        BetBean(sp = bean.bf_sp24, key = "bf_sp24", jianChen = "2:4", typeString = "2:4"),
                        BetBean(sp = bean.bf_sp25, key = "bf_sp25", jianChen = "2:5", typeString = "2:5"),
                        BetBean(sp = bean.bf_sp30, key = "bf_sp30", jianChen = "3:0", typeString = "3:0"),
                        BetBean(sp = bean.bf_sp31, key = "bf_sp31", jianChen = "3:1", typeString = "3:1"),
                        BetBean(sp = bean.bf_sp32, key = "bf_sp31", jianChen = "3:2", typeString = "3:2"),
                        BetBean(sp = bean.bf_sp33, key = "bf_sp33", jianChen = "3:3", typeString = "3:3"),
                        BetBean(sp = bean.bf_sp40, key = "bf_sp40", jianChen = "4:0", typeString = "4:0"),
                        BetBean(sp = bean.bf_sp41, key = "bf_sp41", jianChen = "4:1", typeString = "4:1"),
                        BetBean(sp = bean.bf_sp42, key = "bf_sp42", jianChen = "4:2", typeString = "4:2"),
                        BetBean(sp = bean.bf_sp50, key = "bf_sp50", jianChen = "5:0", typeString = "5:0"),
                        BetBean(sp = bean.bf_sp51, key = "bf_sp51", jianChen = "5:1", typeString = "5:1"),
                        BetBean(sp = bean.bf_sp52, key = "bf_sp52", jianChen = "5:2", typeString = "5:2"),
                        BetBean(sp = bean.bf_spA0, key = "bf_spA0", jianChen = "负其他", typeString = "负其他"),
                        BetBean(sp = bean.bf_spA1, key = "bf_spA1", jianChen = "平其他", typeString = "平其他"),
                        BetBean(sp = bean.bf_spA3, key = "bf_spA3", jianChen = "胜其他", typeString = "胜其他"),
                        BetBean(sp = bean.bqc_sp00, key = "bqc_sp00", jianChen = "负负", typeString = "0:0"),
                        BetBean(sp = bean.bqc_sp01, key = "bqc_sp01", jianChen = "负平", typeString = "0:1"),
                        BetBean(sp = bean.bqc_sp03, key = "bqc_sp03", jianChen = "负胜", typeString = "0:3"),
                        BetBean(sp = bean.bqc_sp10, key = "bqc_sp10", jianChen = "平负", typeString = "1:0"),
                        BetBean(sp = bean.bqc_sp11, key = "bqc_sp11", jianChen = "平平", typeString = "1:1"),
                        BetBean(sp = bean.bqc_sp13, key = "bqc_sp13", jianChen = "平胜", typeString = "1:3"),
                        BetBean(sp = bean.bqc_sp30, key = "bqc_sp30", jianChen = "胜负", typeString = "3:0"),
                        BetBean(sp = bean.bqc_sp31, key = "bqc_sp31", jianChen = "胜平", typeString = "3:1"),
                        BetBean(sp = bean.bqc_sp33, key = "bqc_sp33", jianChen = "胜胜", typeString = "3:3"),
                        BetBean(sp = bean.jqs_sp0, key = "jqs_sp0", jianChen = "0球", typeString = "0球"),
                        BetBean(sp = bean.jqs_sp1, key = "jqs_sp1", jianChen = "1球", typeString = "1球"),
                        BetBean(sp = bean.jqs_sp2, key = "jqs_sp2", jianChen = "2球", typeString = "2球"),
                        BetBean(sp = bean.jqs_sp3, key = "jqs_sp3", jianChen = "3球", typeString = "3球"),
                        BetBean(sp = bean.jqs_sp4, key = "jqs_sp4", jianChen = "4球", typeString = "4球"),
                        BetBean(sp = bean.jqs_sp5, key = "jqs_sp5", jianChen = "5球", typeString = "5球"),
                        BetBean(sp = bean.jqs_sp6, key = "jqs_sp6", jianChen = "6球", typeString = "6球"),
                        BetBean(sp = bean.jqs_sp7, key = "jqs_sp7", jianChen = "7+球", typeString = "7+球"),
                        BetBean(sp = bean.spf_sp3, key = "spf_sp3", jianChen = "胜", typeString = "胜"),
                        BetBean(sp = bean.spf_sp1, key = "spf_sp1", jianChen = "平", typeString = "平"),
                        BetBean(sp = bean.spf_sp0, key = "spf_sp0", jianChen = "负", typeString = "负"),
                        BetBean(sp = bean.rqspf_sp3, key = "rqspf_sp3", jianChen = "让胜", typeString = "让胜"),
                        BetBean(sp = bean.rqspf_sp1, key = "rqspf_sp1", jianChen = "让平", typeString = "让平"),
                        BetBean(sp = bean.rqspf_sp0, key = "rqspf_sp0", jianChen = "让负", typeString = "让负")
                ),


                spfFixed = bean.spfFixed,
                rqspfFixed = bean.rqspfFixed,
                bqcFixed = bean.bqcFixed,
                jqsFixed = bean.jqsFixed,
                bfFixed = bean.bfFixed,
                spfSingle = bean.spfSingle,
                rqspfSingle = bean.rqspfSingle,
                bfSingle = bean.bfSingle,
                bqcSingle = bean.bqcSingle,
                jqsSingle = bean.jqsSingle,
                jcId = bean.jcId
        )
    }


    fun getBetNameFromSp(bet: Bet): BetBean {
        val betList = arrayListOf(
                BetBean(key = "bf_sp00", jianChen = "0:0", typeString = "1:0"),
                BetBean(key = "bf_sp01", jianChen = "0:1", typeString = "0:1"),
                BetBean(key = "bf_sp02", jianChen = "0:2", typeString = "0:2"),
                BetBean(key = "bf_sp03", jianChen = "0:3", typeString = "0:3"),
                BetBean(key = "bf_sp04", jianChen = "0:4", typeString = "0:4"),
                BetBean(key = "bf_sp05", jianChen = "0:5", typeString = "0:5"),
                BetBean(key = "bf_sp10", jianChen = "1:0", typeString = "1:0"),
                BetBean(key = "bf_sp11", jianChen = "1:1", typeString = "1:1"),
                BetBean(key = "bf_sp12", jianChen = "1:2", typeString = "1:2"),
                BetBean(key = "bf_sp13", jianChen = "1:3", typeString = "1:3"),
                BetBean(key = "bf_sp14", jianChen = "1:4", typeString = "1:4"),
                BetBean(key = "bf_sp14", jianChen = "1:5", typeString = "1:5"),
                BetBean(key = "bf_sp20", jianChen = "2:0", typeString = "2:0"),
                BetBean(key = "bf_sp21", jianChen = "2:1", typeString = "2:1"),
                BetBean(key = "bf_sp22", jianChen = "2:2", typeString = "2:2"),
                BetBean(key = "bf_sp23", jianChen = "2:3", typeString = "2:3"),
                BetBean(key = "bf_sp24", jianChen = "2:4", typeString = "2:4"),
                BetBean(key = "bf_sp25", jianChen = "2:5", typeString = "2:5"),
                BetBean(key = "bf_sp30", jianChen = "3:0", typeString = "3:0"),
                BetBean(key = "bf_sp31", jianChen = "3:1", typeString = "3:1"),
                BetBean(key = "bf_sp31", jianChen = "3:2", typeString = "3:2"),
                BetBean(key = "bf_sp33", jianChen = "3:3", typeString = "3:3"),
                BetBean(key = "bf_sp40", jianChen = "4:0", typeString = "4:0"),
                BetBean(key = "bf_sp41", jianChen = "4:1", typeString = "4:1"),
                BetBean(key = "bf_sp42", jianChen = "4:2", typeString = "4:2"),
                BetBean(key = "bf_sp50", jianChen = "5:0", typeString = "5:0"),
                BetBean(key = "bf_sp51", jianChen = "5:1", typeString = "5:1"),
                BetBean(key = "bf_sp52", jianChen = "5:2", typeString = "5:2"),
                BetBean(key = "bf_spA0", jianChen = "负其他", typeString = "负其他"),
                BetBean(key = "bf_spA1", jianChen = "平其他", typeString = "平其他"),
                BetBean(key = "bf_spA3", jianChen = "胜其他", typeString = "胜其他"),
                BetBean(key = "bqc_sp00", jianChen = "负负", typeString = "0:0"),
                BetBean(key = "bqc_sp01", jianChen = "负平", typeString = "0:1"),
                BetBean(key = "bqc_sp03", jianChen = "负胜", typeString = "0:3"),
                BetBean(key = "bqc_sp10", jianChen = "平负", typeString = "1:0"),
                BetBean(key = "bqc_sp11", jianChen = "平平", typeString = "1:1"),
                BetBean(key = "bqc_sp13", jianChen = "平胜", typeString = "1:3"),
                BetBean(key = "bqc_sp30", jianChen = "胜负", typeString = "3:0"),
                BetBean(key = "bqc_sp31", jianChen = "胜平", typeString = "3:1"),
                BetBean(key = "bqc_sp33", jianChen = "胜胜", typeString = "3:3"),
                BetBean(key = "jqs_sp0", jianChen = "0球", typeString = "0球"),
                BetBean(key = "jqs_sp1", jianChen = "1球", typeString = "1球"),
                BetBean(key = "jqs_sp2", jianChen = "2球", typeString = "2球"),
                BetBean(key = "jqs_sp3", jianChen = "3球", typeString = "3球"),
                BetBean(key = "jqs_sp4", jianChen = "4球", typeString = "4球"),
                BetBean(key = "jqs_sp5", jianChen = "5球", typeString = "5球"),
                BetBean(key = "jqs_sp6", jianChen = "6球", typeString = "6球"),
                BetBean(key = "jqs_sp7", jianChen = "7+球", typeString = "7+球"),
                BetBean(key = "spf_sp3", jianChen = "胜", typeString = "胜"),
                BetBean(key = "spf_sp1", jianChen = "平", typeString = "平"),
                BetBean(key = "spf_sp0", jianChen = "负", typeString = "负"),
                BetBean(key = "rqspf_sp3", jianChen = "让胜", typeString = "让胜"),
                BetBean(key = "rqspf_sp1", jianChen = "让平", typeString = "让平"),
                BetBean(key = "rqspf_sp0", jianChen = "让负", typeString = "让负")
        )

        val betBean = betList.first { it.key == bet.bet_key }
        betBean.sp = bet.sp
        return  betBean


    }
}