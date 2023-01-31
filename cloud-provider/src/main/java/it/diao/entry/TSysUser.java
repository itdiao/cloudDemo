package it.diao.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户表
 * @TableName T_Sys_User
 */
public class TSysUser implements Serializable {
    /**
     * 
     */
    private String fUserid;

    /**
     * 
     */
    private String fAccountcode;

    /**
     * 
     */
    private String fAccountpassword;

    /**
     * 
     */
    private String fUsername;

    /**
     * 
     */
    private String fSex;

    /**
     * 
     */
    private String fUserheaduri;

    /**
     * 
     */
    private String fMobilephone;

    /**
     * 
     */
    private String fOfficetel;

    /**
     * 
     */
    private String fOfficefax;

    /**
     * 
     */
    private String fPostaladdress;

    /**
     * 
     */
    private String fPostalcode;

    /**
     * 
     */
    private String fEmail;

    /**
     * 
     */
    private Date fPasswordvaliddate;

    /**
     * 
     */
    private Integer fUserstate;

    /**
     * 
     */
    private Integer fAccountstate;

    /**
     * 
     */
    private Integer fUserorder;

    /**
     * 
     */
    private String fMainunitid;

    /**
     * 
     */
    private String fMaindepartid;

    /**
     * 
     */
    private String fMainpositionid;

    /**
     * 
     */
    private Integer fIsinitialpwd;

    /**
     * 
     */
    private Integer fLockstate;

    /**
     * 
     */
    private Date fLockdate;

    /**
     * 
     */
    private String fHouseno;

    /**
     * 
     */
    private String fEnforcode;

    /**
     * 
     */
    private String fEpbenforcode;

    /**
     * 
     */
    private String fUsernumber;

    /**
     * 
     */
    private String fCreateuserid;

    /**
     * 
     */
    private String fCreateusername;

    /**
     * 
     */
    private String fCreatedeptid;

    /**
     * 
     */
    private String fCreatedeptname;

    /**
     * 
     */
    private String fCreateunitid;

    /**
     * 
     */
    private String fCreateuintname;

    /**
     * 
     */
    private Date fCreatetime;

    /**
     * 
     */
    private String fUpdateuserid;

    /**
     * 
     */
    private String fUpdateusername;

    /**
     * 
     */
    private String fUpdatedeptid;

    /**
     * 
     */
    private String fUpdatedeptname;

    /**
     * 
     */
    private String fUpdateunitid;

    /**
     * 
     */
    private String fUpdateunitname;

    /**
     * 
     */
    private Date fUpdatetime;

    /**
     * 
     */
    private Integer fIsinservice;

    /**
     * 
     */
    private Integer fIspost;

    /**
     * 
     */
    private Integer fIsfieldper;

    /**
     * 
     */
    private Date fMepupdatetime;

    /**
     * 
     */
    private Date fCityupdatetime;

    /**
     * 
     */
    private String fEducationcode;

    /**
     * 
     */
    private String fSchool;

    /**
     * 
     */
    private String fAge;

    /**
     * 
     */
    private String fRecord;

    /**
     * 
     */
    private Long yhbh;

    /**
     * 
     */
    private Date fBirthdate;

    /**
     * 
     */
    private String fLawenforyear;

    /**
     * 
     */
    private String fEnforindustry;

    /**
     * 
     */
    private String fCardid;

    /**
     * 用户类型(0:普通用户；1加油站用户)
     */
    private Integer fUsertype;

    /**
     * 加油站ID（用户类型为加油站用户时，此字段值为加油站ID，否则为空）
     */
    private String fGasstationid;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getfUserid() {
        return fUserid;
    }

    /**
     * 
     */
    public void setfUserid(String fUserid) {
        this.fUserid = fUserid;
    }

    /**
     * 
     */
    public String getfAccountcode() {
        return fAccountcode;
    }

    /**
     * 
     */
    public void setfAccountcode(String fAccountcode) {
        this.fAccountcode = fAccountcode;
    }

    /**
     * 
     */
    public String getfAccountpassword() {
        return fAccountpassword;
    }

    /**
     * 
     */
    public void setfAccountpassword(String fAccountpassword) {
        this.fAccountpassword = fAccountpassword;
    }

    /**
     * 
     */
    public String getfUsername() {
        return fUsername;
    }

    /**
     * 
     */
    public void setfUsername(String fUsername) {
        this.fUsername = fUsername;
    }

    /**
     * 
     */
    public String getfSex() {
        return fSex;
    }

    /**
     * 
     */
    public void setfSex(String fSex) {
        this.fSex = fSex;
    }

    /**
     * 
     */
    public String getfUserheaduri() {
        return fUserheaduri;
    }

    /**
     * 
     */
    public void setfUserheaduri(String fUserheaduri) {
        this.fUserheaduri = fUserheaduri;
    }

    /**
     * 
     */
    public String getfMobilephone() {
        return fMobilephone;
    }

    /**
     * 
     */
    public void setfMobilephone(String fMobilephone) {
        this.fMobilephone = fMobilephone;
    }

    /**
     * 
     */
    public String getfOfficetel() {
        return fOfficetel;
    }

    /**
     * 
     */
    public void setfOfficetel(String fOfficetel) {
        this.fOfficetel = fOfficetel;
    }

    /**
     * 
     */
    public String getfOfficefax() {
        return fOfficefax;
    }

    /**
     * 
     */
    public void setfOfficefax(String fOfficefax) {
        this.fOfficefax = fOfficefax;
    }

    /**
     * 
     */
    public String getfPostaladdress() {
        return fPostaladdress;
    }

    /**
     * 
     */
    public void setfPostaladdress(String fPostaladdress) {
        this.fPostaladdress = fPostaladdress;
    }

    /**
     * 
     */
    public String getfPostalcode() {
        return fPostalcode;
    }

    /**
     * 
     */
    public void setfPostalcode(String fPostalcode) {
        this.fPostalcode = fPostalcode;
    }

    /**
     * 
     */
    public String getfEmail() {
        return fEmail;
    }

    /**
     * 
     */
    public void setfEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    /**
     * 
     */
    public Date getfPasswordvaliddate() {
        return fPasswordvaliddate;
    }

    /**
     * 
     */
    public void setfPasswordvaliddate(Date fPasswordvaliddate) {
        this.fPasswordvaliddate = fPasswordvaliddate;
    }

    /**
     * 
     */
    public Integer getfUserstate() {
        return fUserstate;
    }

    /**
     * 
     */
    public void setfUserstate(Integer fUserstate) {
        this.fUserstate = fUserstate;
    }

    /**
     * 
     */
    public Integer getfAccountstate() {
        return fAccountstate;
    }

    /**
     * 
     */
    public void setfAccountstate(Integer fAccountstate) {
        this.fAccountstate = fAccountstate;
    }

    /**
     * 
     */
    public Integer getfUserorder() {
        return fUserorder;
    }

    /**
     * 
     */
    public void setfUserorder(Integer fUserorder) {
        this.fUserorder = fUserorder;
    }

    /**
     * 
     */
    public String getfMainunitid() {
        return fMainunitid;
    }

    /**
     * 
     */
    public void setfMainunitid(String fMainunitid) {
        this.fMainunitid = fMainunitid;
    }

    /**
     * 
     */
    public String getfMaindepartid() {
        return fMaindepartid;
    }

    /**
     * 
     */
    public void setfMaindepartid(String fMaindepartid) {
        this.fMaindepartid = fMaindepartid;
    }

    /**
     * 
     */
    public String getfMainpositionid() {
        return fMainpositionid;
    }

    /**
     * 
     */
    public void setfMainpositionid(String fMainpositionid) {
        this.fMainpositionid = fMainpositionid;
    }

    /**
     * 
     */
    public Integer getfIsinitialpwd() {
        return fIsinitialpwd;
    }

    /**
     * 
     */
    public void setfIsinitialpwd(Integer fIsinitialpwd) {
        this.fIsinitialpwd = fIsinitialpwd;
    }

    /**
     * 
     */
    public Integer getfLockstate() {
        return fLockstate;
    }

    /**
     * 
     */
    public void setfLockstate(Integer fLockstate) {
        this.fLockstate = fLockstate;
    }

    /**
     * 
     */
    public Date getfLockdate() {
        return fLockdate;
    }

    /**
     * 
     */
    public void setfLockdate(Date fLockdate) {
        this.fLockdate = fLockdate;
    }

    /**
     * 
     */
    public String getfHouseno() {
        return fHouseno;
    }

    /**
     * 
     */
    public void setfHouseno(String fHouseno) {
        this.fHouseno = fHouseno;
    }

    /**
     * 
     */
    public String getfEnforcode() {
        return fEnforcode;
    }

    /**
     * 
     */
    public void setfEnforcode(String fEnforcode) {
        this.fEnforcode = fEnforcode;
    }

    /**
     * 
     */
    public String getfEpbenforcode() {
        return fEpbenforcode;
    }

    /**
     * 
     */
    public void setfEpbenforcode(String fEpbenforcode) {
        this.fEpbenforcode = fEpbenforcode;
    }

    /**
     * 
     */
    public String getfUsernumber() {
        return fUsernumber;
    }

    /**
     * 
     */
    public void setfUsernumber(String fUsernumber) {
        this.fUsernumber = fUsernumber;
    }

    /**
     * 
     */
    public String getfCreateuserid() {
        return fCreateuserid;
    }

    /**
     * 
     */
    public void setfCreateuserid(String fCreateuserid) {
        this.fCreateuserid = fCreateuserid;
    }

    /**
     * 
     */
    public String getfCreateusername() {
        return fCreateusername;
    }

    /**
     * 
     */
    public void setfCreateusername(String fCreateusername) {
        this.fCreateusername = fCreateusername;
    }

    /**
     * 
     */
    public String getfCreatedeptid() {
        return fCreatedeptid;
    }

    /**
     * 
     */
    public void setfCreatedeptid(String fCreatedeptid) {
        this.fCreatedeptid = fCreatedeptid;
    }

    /**
     * 
     */
    public String getfCreatedeptname() {
        return fCreatedeptname;
    }

    /**
     * 
     */
    public void setfCreatedeptname(String fCreatedeptname) {
        this.fCreatedeptname = fCreatedeptname;
    }

    /**
     * 
     */
    public String getfCreateunitid() {
        return fCreateunitid;
    }

    /**
     * 
     */
    public void setfCreateunitid(String fCreateunitid) {
        this.fCreateunitid = fCreateunitid;
    }

    /**
     * 
     */
    public String getfCreateuintname() {
        return fCreateuintname;
    }

    /**
     * 
     */
    public void setfCreateuintname(String fCreateuintname) {
        this.fCreateuintname = fCreateuintname;
    }

    /**
     * 
     */
    public Date getfCreatetime() {
        return fCreatetime;
    }

    /**
     * 
     */
    public void setfCreatetime(Date fCreatetime) {
        this.fCreatetime = fCreatetime;
    }

    /**
     * 
     */
    public String getfUpdateuserid() {
        return fUpdateuserid;
    }

    /**
     * 
     */
    public void setfUpdateuserid(String fUpdateuserid) {
        this.fUpdateuserid = fUpdateuserid;
    }

    /**
     * 
     */
    public String getfUpdateusername() {
        return fUpdateusername;
    }

    /**
     * 
     */
    public void setfUpdateusername(String fUpdateusername) {
        this.fUpdateusername = fUpdateusername;
    }

    /**
     * 
     */
    public String getfUpdatedeptid() {
        return fUpdatedeptid;
    }

    /**
     * 
     */
    public void setfUpdatedeptid(String fUpdatedeptid) {
        this.fUpdatedeptid = fUpdatedeptid;
    }

    /**
     * 
     */
    public String getfUpdatedeptname() {
        return fUpdatedeptname;
    }

    /**
     * 
     */
    public void setfUpdatedeptname(String fUpdatedeptname) {
        this.fUpdatedeptname = fUpdatedeptname;
    }

    /**
     * 
     */
    public String getfUpdateunitid() {
        return fUpdateunitid;
    }

    /**
     * 
     */
    public void setfUpdateunitid(String fUpdateunitid) {
        this.fUpdateunitid = fUpdateunitid;
    }

    /**
     * 
     */
    public String getfUpdateunitname() {
        return fUpdateunitname;
    }

    /**
     * 
     */
    public void setfUpdateunitname(String fUpdateunitname) {
        this.fUpdateunitname = fUpdateunitname;
    }

    /**
     * 
     */
    public Date getfUpdatetime() {
        return fUpdatetime;
    }

    /**
     * 
     */
    public void setfUpdatetime(Date fUpdatetime) {
        this.fUpdatetime = fUpdatetime;
    }

    /**
     * 
     */
    public Integer getfIsinservice() {
        return fIsinservice;
    }

    /**
     * 
     */
    public void setfIsinservice(Integer fIsinservice) {
        this.fIsinservice = fIsinservice;
    }

    /**
     * 
     */
    public Integer getfIspost() {
        return fIspost;
    }

    /**
     * 
     */
    public void setfIspost(Integer fIspost) {
        this.fIspost = fIspost;
    }

    /**
     * 
     */
    public Integer getfIsfieldper() {
        return fIsfieldper;
    }

    /**
     * 
     */
    public void setfIsfieldper(Integer fIsfieldper) {
        this.fIsfieldper = fIsfieldper;
    }

    /**
     * 
     */
    public Date getfMepupdatetime() {
        return fMepupdatetime;
    }

    /**
     * 
     */
    public void setfMepupdatetime(Date fMepupdatetime) {
        this.fMepupdatetime = fMepupdatetime;
    }

    /**
     * 
     */
    public Date getfCityupdatetime() {
        return fCityupdatetime;
    }

    /**
     * 
     */
    public void setfCityupdatetime(Date fCityupdatetime) {
        this.fCityupdatetime = fCityupdatetime;
    }

    /**
     * 
     */
    public String getfEducationcode() {
        return fEducationcode;
    }

    /**
     * 
     */
    public void setfEducationcode(String fEducationcode) {
        this.fEducationcode = fEducationcode;
    }

    /**
     * 
     */
    public String getfSchool() {
        return fSchool;
    }

    /**
     * 
     */
    public void setfSchool(String fSchool) {
        this.fSchool = fSchool;
    }

    /**
     * 
     */
    public String getfAge() {
        return fAge;
    }

    /**
     * 
     */
    public void setfAge(String fAge) {
        this.fAge = fAge;
    }

    /**
     * 
     */
    public String getfRecord() {
        return fRecord;
    }

    /**
     * 
     */
    public void setfRecord(String fRecord) {
        this.fRecord = fRecord;
    }

    /**
     * 
     */
    public Long getYhbh() {
        return yhbh;
    }

    /**
     * 
     */
    public void setYhbh(Long yhbh) {
        this.yhbh = yhbh;
    }

    /**
     * 
     */
    public Date getfBirthdate() {
        return fBirthdate;
    }

    /**
     * 
     */
    public void setfBirthdate(Date fBirthdate) {
        this.fBirthdate = fBirthdate;
    }

    /**
     * 
     */
    public String getfLawenforyear() {
        return fLawenforyear;
    }

    /**
     * 
     */
    public void setfLawenforyear(String fLawenforyear) {
        this.fLawenforyear = fLawenforyear;
    }

    /**
     * 
     */
    public String getfEnforindustry() {
        return fEnforindustry;
    }

    /**
     * 
     */
    public void setfEnforindustry(String fEnforindustry) {
        this.fEnforindustry = fEnforindustry;
    }

    /**
     * 
     */
    public String getfCardid() {
        return fCardid;
    }

    /**
     * 
     */
    public void setfCardid(String fCardid) {
        this.fCardid = fCardid;
    }

    /**
     * 用户类型(0:普通用户；1加油站用户)
     */
    public Integer getfUsertype() {
        return fUsertype;
    }

    /**
     * 用户类型(0:普通用户；1加油站用户)
     */
    public void setfUsertype(Integer fUsertype) {
        this.fUsertype = fUsertype;
    }

    /**
     * 加油站ID（用户类型为加油站用户时，此字段值为加油站ID，否则为空）
     */
    public String getfGasstationid() {
        return fGasstationid;
    }

    /**
     * 加油站ID（用户类型为加油站用户时，此字段值为加油站ID，否则为空）
     */
    public void setfGasstationid(String fGasstationid) {
        this.fGasstationid = fGasstationid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TSysUser other = (TSysUser) that;
        return (this.getfUserid() == null ? other.getfUserid() == null : this.getfUserid().equals(other.getfUserid()))
            && (this.getfAccountcode() == null ? other.getfAccountcode() == null : this.getfAccountcode().equals(other.getfAccountcode()))
            && (this.getfAccountpassword() == null ? other.getfAccountpassword() == null : this.getfAccountpassword().equals(other.getfAccountpassword()))
            && (this.getfUsername() == null ? other.getfUsername() == null : this.getfUsername().equals(other.getfUsername()))
            && (this.getfSex() == null ? other.getfSex() == null : this.getfSex().equals(other.getfSex()))
            && (this.getfUserheaduri() == null ? other.getfUserheaduri() == null : this.getfUserheaduri().equals(other.getfUserheaduri()))
            && (this.getfMobilephone() == null ? other.getfMobilephone() == null : this.getfMobilephone().equals(other.getfMobilephone()))
            && (this.getfOfficetel() == null ? other.getfOfficetel() == null : this.getfOfficetel().equals(other.getfOfficetel()))
            && (this.getfOfficefax() == null ? other.getfOfficefax() == null : this.getfOfficefax().equals(other.getfOfficefax()))
            && (this.getfPostaladdress() == null ? other.getfPostaladdress() == null : this.getfPostaladdress().equals(other.getfPostaladdress()))
            && (this.getfPostalcode() == null ? other.getfPostalcode() == null : this.getfPostalcode().equals(other.getfPostalcode()))
            && (this.getfEmail() == null ? other.getfEmail() == null : this.getfEmail().equals(other.getfEmail()))
            && (this.getfPasswordvaliddate() == null ? other.getfPasswordvaliddate() == null : this.getfPasswordvaliddate().equals(other.getfPasswordvaliddate()))
            && (this.getfUserstate() == null ? other.getfUserstate() == null : this.getfUserstate().equals(other.getfUserstate()))
            && (this.getfAccountstate() == null ? other.getfAccountstate() == null : this.getfAccountstate().equals(other.getfAccountstate()))
            && (this.getfUserorder() == null ? other.getfUserorder() == null : this.getfUserorder().equals(other.getfUserorder()))
            && (this.getfMainunitid() == null ? other.getfMainunitid() == null : this.getfMainunitid().equals(other.getfMainunitid()))
            && (this.getfMaindepartid() == null ? other.getfMaindepartid() == null : this.getfMaindepartid().equals(other.getfMaindepartid()))
            && (this.getfMainpositionid() == null ? other.getfMainpositionid() == null : this.getfMainpositionid().equals(other.getfMainpositionid()))
            && (this.getfIsinitialpwd() == null ? other.getfIsinitialpwd() == null : this.getfIsinitialpwd().equals(other.getfIsinitialpwd()))
            && (this.getfLockstate() == null ? other.getfLockstate() == null : this.getfLockstate().equals(other.getfLockstate()))
            && (this.getfLockdate() == null ? other.getfLockdate() == null : this.getfLockdate().equals(other.getfLockdate()))
            && (this.getfHouseno() == null ? other.getfHouseno() == null : this.getfHouseno().equals(other.getfHouseno()))
            && (this.getfEnforcode() == null ? other.getfEnforcode() == null : this.getfEnforcode().equals(other.getfEnforcode()))
            && (this.getfEpbenforcode() == null ? other.getfEpbenforcode() == null : this.getfEpbenforcode().equals(other.getfEpbenforcode()))
            && (this.getfUsernumber() == null ? other.getfUsernumber() == null : this.getfUsernumber().equals(other.getfUsernumber()))
            && (this.getfCreateuserid() == null ? other.getfCreateuserid() == null : this.getfCreateuserid().equals(other.getfCreateuserid()))
            && (this.getfCreateusername() == null ? other.getfCreateusername() == null : this.getfCreateusername().equals(other.getfCreateusername()))
            && (this.getfCreatedeptid() == null ? other.getfCreatedeptid() == null : this.getfCreatedeptid().equals(other.getfCreatedeptid()))
            && (this.getfCreatedeptname() == null ? other.getfCreatedeptname() == null : this.getfCreatedeptname().equals(other.getfCreatedeptname()))
            && (this.getfCreateunitid() == null ? other.getfCreateunitid() == null : this.getfCreateunitid().equals(other.getfCreateunitid()))
            && (this.getfCreateuintname() == null ? other.getfCreateuintname() == null : this.getfCreateuintname().equals(other.getfCreateuintname()))
            && (this.getfCreatetime() == null ? other.getfCreatetime() == null : this.getfCreatetime().equals(other.getfCreatetime()))
            && (this.getfUpdateuserid() == null ? other.getfUpdateuserid() == null : this.getfUpdateuserid().equals(other.getfUpdateuserid()))
            && (this.getfUpdateusername() == null ? other.getfUpdateusername() == null : this.getfUpdateusername().equals(other.getfUpdateusername()))
            && (this.getfUpdatedeptid() == null ? other.getfUpdatedeptid() == null : this.getfUpdatedeptid().equals(other.getfUpdatedeptid()))
            && (this.getfUpdatedeptname() == null ? other.getfUpdatedeptname() == null : this.getfUpdatedeptname().equals(other.getfUpdatedeptname()))
            && (this.getfUpdateunitid() == null ? other.getfUpdateunitid() == null : this.getfUpdateunitid().equals(other.getfUpdateunitid()))
            && (this.getfUpdateunitname() == null ? other.getfUpdateunitname() == null : this.getfUpdateunitname().equals(other.getfUpdateunitname()))
            && (this.getfUpdatetime() == null ? other.getfUpdatetime() == null : this.getfUpdatetime().equals(other.getfUpdatetime()))
            && (this.getfIsinservice() == null ? other.getfIsinservice() == null : this.getfIsinservice().equals(other.getfIsinservice()))
            && (this.getfIspost() == null ? other.getfIspost() == null : this.getfIspost().equals(other.getfIspost()))
            && (this.getfIsfieldper() == null ? other.getfIsfieldper() == null : this.getfIsfieldper().equals(other.getfIsfieldper()))
            && (this.getfMepupdatetime() == null ? other.getfMepupdatetime() == null : this.getfMepupdatetime().equals(other.getfMepupdatetime()))
            && (this.getfCityupdatetime() == null ? other.getfCityupdatetime() == null : this.getfCityupdatetime().equals(other.getfCityupdatetime()))
            && (this.getfEducationcode() == null ? other.getfEducationcode() == null : this.getfEducationcode().equals(other.getfEducationcode()))
            && (this.getfSchool() == null ? other.getfSchool() == null : this.getfSchool().equals(other.getfSchool()))
            && (this.getfAge() == null ? other.getfAge() == null : this.getfAge().equals(other.getfAge()))
            && (this.getfRecord() == null ? other.getfRecord() == null : this.getfRecord().equals(other.getfRecord()))
            && (this.getYhbh() == null ? other.getYhbh() == null : this.getYhbh().equals(other.getYhbh()))
            && (this.getfBirthdate() == null ? other.getfBirthdate() == null : this.getfBirthdate().equals(other.getfBirthdate()))
            && (this.getfLawenforyear() == null ? other.getfLawenforyear() == null : this.getfLawenforyear().equals(other.getfLawenforyear()))
            && (this.getfEnforindustry() == null ? other.getfEnforindustry() == null : this.getfEnforindustry().equals(other.getfEnforindustry()))
            && (this.getfCardid() == null ? other.getfCardid() == null : this.getfCardid().equals(other.getfCardid()))
            && (this.getfUsertype() == null ? other.getfUsertype() == null : this.getfUsertype().equals(other.getfUsertype()))
            && (this.getfGasstationid() == null ? other.getfGasstationid() == null : this.getfGasstationid().equals(other.getfGasstationid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getfUserid() == null) ? 0 : getfUserid().hashCode());
        result = prime * result + ((getfAccountcode() == null) ? 0 : getfAccountcode().hashCode());
        result = prime * result + ((getfAccountpassword() == null) ? 0 : getfAccountpassword().hashCode());
        result = prime * result + ((getfUsername() == null) ? 0 : getfUsername().hashCode());
        result = prime * result + ((getfSex() == null) ? 0 : getfSex().hashCode());
        result = prime * result + ((getfUserheaduri() == null) ? 0 : getfUserheaduri().hashCode());
        result = prime * result + ((getfMobilephone() == null) ? 0 : getfMobilephone().hashCode());
        result = prime * result + ((getfOfficetel() == null) ? 0 : getfOfficetel().hashCode());
        result = prime * result + ((getfOfficefax() == null) ? 0 : getfOfficefax().hashCode());
        result = prime * result + ((getfPostaladdress() == null) ? 0 : getfPostaladdress().hashCode());
        result = prime * result + ((getfPostalcode() == null) ? 0 : getfPostalcode().hashCode());
        result = prime * result + ((getfEmail() == null) ? 0 : getfEmail().hashCode());
        result = prime * result + ((getfPasswordvaliddate() == null) ? 0 : getfPasswordvaliddate().hashCode());
        result = prime * result + ((getfUserstate() == null) ? 0 : getfUserstate().hashCode());
        result = prime * result + ((getfAccountstate() == null) ? 0 : getfAccountstate().hashCode());
        result = prime * result + ((getfUserorder() == null) ? 0 : getfUserorder().hashCode());
        result = prime * result + ((getfMainunitid() == null) ? 0 : getfMainunitid().hashCode());
        result = prime * result + ((getfMaindepartid() == null) ? 0 : getfMaindepartid().hashCode());
        result = prime * result + ((getfMainpositionid() == null) ? 0 : getfMainpositionid().hashCode());
        result = prime * result + ((getfIsinitialpwd() == null) ? 0 : getfIsinitialpwd().hashCode());
        result = prime * result + ((getfLockstate() == null) ? 0 : getfLockstate().hashCode());
        result = prime * result + ((getfLockdate() == null) ? 0 : getfLockdate().hashCode());
        result = prime * result + ((getfHouseno() == null) ? 0 : getfHouseno().hashCode());
        result = prime * result + ((getfEnforcode() == null) ? 0 : getfEnforcode().hashCode());
        result = prime * result + ((getfEpbenforcode() == null) ? 0 : getfEpbenforcode().hashCode());
        result = prime * result + ((getfUsernumber() == null) ? 0 : getfUsernumber().hashCode());
        result = prime * result + ((getfCreateuserid() == null) ? 0 : getfCreateuserid().hashCode());
        result = prime * result + ((getfCreateusername() == null) ? 0 : getfCreateusername().hashCode());
        result = prime * result + ((getfCreatedeptid() == null) ? 0 : getfCreatedeptid().hashCode());
        result = prime * result + ((getfCreatedeptname() == null) ? 0 : getfCreatedeptname().hashCode());
        result = prime * result + ((getfCreateunitid() == null) ? 0 : getfCreateunitid().hashCode());
        result = prime * result + ((getfCreateuintname() == null) ? 0 : getfCreateuintname().hashCode());
        result = prime * result + ((getfCreatetime() == null) ? 0 : getfCreatetime().hashCode());
        result = prime * result + ((getfUpdateuserid() == null) ? 0 : getfUpdateuserid().hashCode());
        result = prime * result + ((getfUpdateusername() == null) ? 0 : getfUpdateusername().hashCode());
        result = prime * result + ((getfUpdatedeptid() == null) ? 0 : getfUpdatedeptid().hashCode());
        result = prime * result + ((getfUpdatedeptname() == null) ? 0 : getfUpdatedeptname().hashCode());
        result = prime * result + ((getfUpdateunitid() == null) ? 0 : getfUpdateunitid().hashCode());
        result = prime * result + ((getfUpdateunitname() == null) ? 0 : getfUpdateunitname().hashCode());
        result = prime * result + ((getfUpdatetime() == null) ? 0 : getfUpdatetime().hashCode());
        result = prime * result + ((getfIsinservice() == null) ? 0 : getfIsinservice().hashCode());
        result = prime * result + ((getfIspost() == null) ? 0 : getfIspost().hashCode());
        result = prime * result + ((getfIsfieldper() == null) ? 0 : getfIsfieldper().hashCode());
        result = prime * result + ((getfMepupdatetime() == null) ? 0 : getfMepupdatetime().hashCode());
        result = prime * result + ((getfCityupdatetime() == null) ? 0 : getfCityupdatetime().hashCode());
        result = prime * result + ((getfEducationcode() == null) ? 0 : getfEducationcode().hashCode());
        result = prime * result + ((getfSchool() == null) ? 0 : getfSchool().hashCode());
        result = prime * result + ((getfAge() == null) ? 0 : getfAge().hashCode());
        result = prime * result + ((getfRecord() == null) ? 0 : getfRecord().hashCode());
        result = prime * result + ((getYhbh() == null) ? 0 : getYhbh().hashCode());
        result = prime * result + ((getfBirthdate() == null) ? 0 : getfBirthdate().hashCode());
        result = prime * result + ((getfLawenforyear() == null) ? 0 : getfLawenforyear().hashCode());
        result = prime * result + ((getfEnforindustry() == null) ? 0 : getfEnforindustry().hashCode());
        result = prime * result + ((getfCardid() == null) ? 0 : getfCardid().hashCode());
        result = prime * result + ((getfUsertype() == null) ? 0 : getfUsertype().hashCode());
        result = prime * result + ((getfGasstationid() == null) ? 0 : getfGasstationid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fUserid=").append(fUserid);
        sb.append(", fAccountcode=").append(fAccountcode);
        sb.append(", fAccountpassword=").append(fAccountpassword);
        sb.append(", fUsername=").append(fUsername);
        sb.append(", fSex=").append(fSex);
        sb.append(", fUserheaduri=").append(fUserheaduri);
        sb.append(", fMobilephone=").append(fMobilephone);
        sb.append(", fOfficetel=").append(fOfficetel);
        sb.append(", fOfficefax=").append(fOfficefax);
        sb.append(", fPostaladdress=").append(fPostaladdress);
        sb.append(", fPostalcode=").append(fPostalcode);
        sb.append(", fEmail=").append(fEmail);
        sb.append(", fPasswordvaliddate=").append(fPasswordvaliddate);
        sb.append(", fUserstate=").append(fUserstate);
        sb.append(", fAccountstate=").append(fAccountstate);
        sb.append(", fUserorder=").append(fUserorder);
        sb.append(", fMainunitid=").append(fMainunitid);
        sb.append(", fMaindepartid=").append(fMaindepartid);
        sb.append(", fMainpositionid=").append(fMainpositionid);
        sb.append(", fIsinitialpwd=").append(fIsinitialpwd);
        sb.append(", fLockstate=").append(fLockstate);
        sb.append(", fLockdate=").append(fLockdate);
        sb.append(", fHouseno=").append(fHouseno);
        sb.append(", fEnforcode=").append(fEnforcode);
        sb.append(", fEpbenforcode=").append(fEpbenforcode);
        sb.append(", fUsernumber=").append(fUsernumber);
        sb.append(", fCreateuserid=").append(fCreateuserid);
        sb.append(", fCreateusername=").append(fCreateusername);
        sb.append(", fCreatedeptid=").append(fCreatedeptid);
        sb.append(", fCreatedeptname=").append(fCreatedeptname);
        sb.append(", fCreateunitid=").append(fCreateunitid);
        sb.append(", fCreateuintname=").append(fCreateuintname);
        sb.append(", fCreatetime=").append(fCreatetime);
        sb.append(", fUpdateuserid=").append(fUpdateuserid);
        sb.append(", fUpdateusername=").append(fUpdateusername);
        sb.append(", fUpdatedeptid=").append(fUpdatedeptid);
        sb.append(", fUpdatedeptname=").append(fUpdatedeptname);
        sb.append(", fUpdateunitid=").append(fUpdateunitid);
        sb.append(", fUpdateunitname=").append(fUpdateunitname);
        sb.append(", fUpdatetime=").append(fUpdatetime);
        sb.append(", fIsinservice=").append(fIsinservice);
        sb.append(", fIspost=").append(fIspost);
        sb.append(", fIsfieldper=").append(fIsfieldper);
        sb.append(", fMepupdatetime=").append(fMepupdatetime);
        sb.append(", fCityupdatetime=").append(fCityupdatetime);
        sb.append(", fEducationcode=").append(fEducationcode);
        sb.append(", fSchool=").append(fSchool);
        sb.append(", fAge=").append(fAge);
        sb.append(", fRecord=").append(fRecord);
        sb.append(", yhbh=").append(yhbh);
        sb.append(", fBirthdate=").append(fBirthdate);
        sb.append(", fLawenforyear=").append(fLawenforyear);
        sb.append(", fEnforindustry=").append(fEnforindustry);
        sb.append(", fCardid=").append(fCardid);
        sb.append(", fUsertype=").append(fUsertype);
        sb.append(", fGasstationid=").append(fGasstationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}