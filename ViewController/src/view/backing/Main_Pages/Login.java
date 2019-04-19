package view.backing.Main_Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.Map;

import javax.faces.component.html.HtmlGraphicImage;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jdbc.driver.OracleDriver;

public class Login {
    
    // generating static variables to use in different scopes
    private static String role_master_id;
    private static String role_detail_pages_id;
    private static String role_detail_modules_id;
    private static String role_master_name;
    private static String pages_id;
    private static String page_name;
    private static String module_menu_id;
    private static String module_name;
    private static String view_rights;
    private static String module_view_rights;
    private static String add_rights;
    private static String edit_rights;
    private static String delete_rights;
    private static String save_rights;
    private static String sessUName;
    
    private RichForm f1;
    private RichDocument d1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem pane1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridRow gr2;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichGridCell gc6;
    private RichGridRow gr3;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridCell gc9;
    private RichGridRow gr4;
    private RichGridCell gc10;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichGridRow gr5;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichGridCell gc15;
    private RichGridRow gr6;
    private RichGridCell gc16;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichGridRow gr7;
    private RichGridCell gc19;
    private RichGridCell gc20;
    private RichGridCell gc21;
    private RichGridRow gr8;
    private RichGridCell gc22;
    private RichGridCell gc23;
    private RichGridCell gc24;
    private HtmlGraphicImage gi1;
    private RichImage i1;
    private RichPanelGroupLayout pgl2;
    private RichSpacer s1;
    private RichImage i2;
    private RichInputText it1;
    private RichSpacer s2;
    private RichPanelGroupLayout pgl3;
    private RichSpacer s3;
    private RichImage i3;
    private RichInputText it2;
    private RichSpacer s4;
    private RichLink l1;
    private RichSpacer s5;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setPane1(RichShowDetailItem pane1) {
        this.pane1 = pane1;
    }

    public RichShowDetailItem getPane1() {
        return pane1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
    }

    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
    }

    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setGc21(RichGridCell gc21) {
        this.gc21 = gc21;
    }

    public RichGridCell getGc21() {
        return gc21;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc22(RichGridCell gc22) {
        this.gc22 = gc22;
    }

    public RichGridCell getGc22() {
        return gc22;
    }

    public void setGc23(RichGridCell gc23) {
        this.gc23 = gc23;
    }

    public RichGridCell getGc23() {
        return gc23;
    }

    public void setGc24(RichGridCell gc24) {
        this.gc24 = gc24;
    }

    public RichGridCell getGc24() {
        return gc24;
    }

    public void setGi1(HtmlGraphicImage gi1) {
        this.gi1 = gi1;
    }

    public HtmlGraphicImage getGi1() {
        return gi1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setI3(RichImage i3) {
        this.i3 = i3;
    }

    public RichImage getI3() {
        return i3;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }
    
    
    // creating generic database connection
    public static Connection getConnection() throws SQLException {
        String username = "emfp";
        String password = "emfp";
        String thinConn = "jdbc:oracle:thin:@192.168.1.102:1521:orcl";
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, username, password);
        conn.setAutoCommit(false);
        return conn;
    }
    
    // session value storing function
    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }
    
    //user logging in
    public String login_action() {
            // Add event code here...
        //SETTING VALUE PROGRAMMATICALLY IN PASSWORD FIELD,,,,ONLY TESTING
//  //          it2.setValue("bla bla bla");
            String username = this.getIt1()
                                  .getValue()
                                  .toString();
            String password = this.getIt2()
                                  .getValue()
                                  .toString();

            sessUName = username;   
            storeOnSession("sessUName" , sessUName);
          System.out.println("value for session..............." + sessUName);
            
            System.out.println(".......................................................................");
            System.out.println(".......................................................................");
            System.out.println("Entered username is : " + username + "....and password is : " + password );
            System.out.println(".......................................................................");
            System.out.println(".......................................................................");
            
        
            
            Connection conn;
    
            try {
                conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rset =
                    stmt.executeQuery("SELECT * FROM tbl_user_master where user_master_name = '" + username + "' and user_master_pwd = '" + password +"'");
    
                if (rset.next()) {
                    //                conn.close();
                    //getting data against column from table
                    role_master_id = (rset.getString("role_master_id")).toString();
    
                    //Storing value in session username from input text field and role_master_id from DB
    
                    System.out.println(".........User Name stored in session is :..." + username + "...");
                    System.out.println(".........User Password stored in session is :..." + password + "...");
                    System.out.println(".........User Role stored in session is :..." + role_master_id + "...");
    
                    //Redirecting to home page after successfull authentication
                    //System.out.println("....... here we go /// you are redirecting now to DASHBOARD ......");
                    //                return "good";
    
                    conn.close();
                    return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
                } else {
                    conn.close();
                    System.out.println("........wrong login credentials........");
                    return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
                    
                }
                
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
            return role_master_id;
//        return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
//        return "good";
    }

//Logout > session cleared and session variable cleared
    public String logout_action(){
        System.out.println("logout called");
        sessUName="";
        storeOnSession("sessUName" , "");
//        return "good";
        return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
    }
    
    //page load all functions
     public String checkSession(String pageName) {
        
    //                //String checkRole = login_action();
                    //        System.out.println(checkRole);
                     page_name = pageName;
                     //Gettting user role master name by role master id
                     String Role_Name = get_user_role_master_name();
                     System.out.println("Role Name is : "+ Role_Name);
    
                     //Gettting page id by page name
                     //String Page_Id = get_page_id();
                     //System.out.println("Page Id is : "+ Page_Id);
    
                     //Gettting role detail id by page id and role master id
                     String role_detail_pages_id = get_role_detail_pages_id();
                     System.out.println("Role Detail Id is : "+ role_detail_pages_id);
                    System.out.println(role_master_id+"....Role Master ID");
                    System.out.println(page_name+"..........Page Name");
             
         return "good";
         
     }
     

     //pge for module load all functions
      public String checkmoduleSession(String moduleName) {
    //
    //         module_name = moduleName;
    //
    ////                  //Gettting page id by page name
    //                  String Module_Id = get_module_menu_id();
    //                  System.out.println("Module Id is : "+ Module_Id);
    //
          return module_view_rights;
    //         return "Y";
          
      }
      
      
     
     //Gettting user role master name by role master id
     public String get_user_role_master_name() {
         
            Connection con_role;
    
            try {
                con_role = getConnection();
                Statement stmt = con_role.createStatement();
                ResultSet rset =
                    stmt.executeQuery("SELECT * FROM tbl_role_master where role_master_id = '" + role_master_id +  "'");
    
                if (rset.next()) {
    
                    role_master_name = (rset.getString("role_master_name")).toString();
    
                    System.out.println(".........get_user_role_master_name.........function called");
                    System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                    System.out.println(".........Role Master NAME is :..." + role_master_name + "...");
    
                    con_role.close();
    
                    return role_master_name;
                } else {
                    System.out.println("........NO ROLE FOUND........");
                }
                con_role.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return role_master_name;
    //        return "Super Admin";
     }
     
     
     //Gettting module id by module name
     public String get_module_menu_id() {
    //
    //        Connection con_mod;
    //
    //        try {
    //            con_mod = getConnection();
    //            Statement stmt = con_mod.createStatement();
    //            ResultSet rset =
    //                stmt.executeQuery("SELECT * FROM tbl_module_menu where module_menu_name = '" + module_name +  "'");
    //
    //            if (rset.next()) {
    //
    //                module_menu_id = (rset.getString("module_menu_id")).toString();
    //
    //                System.out.println(".........get_module_menu_id.........function called");
    //                System.out.println(".........Module ID is :..." + module_menu_id + "...");
    //                System.out.println(".........Module NAME is :..." + module_name + "...");
    //
    //                con_mod.close();
    //                get_role_detail_module_id();
    //                return module_menu_id;
    //
    //            } else {
    //                System.out.println("........NO Module FOUND........");
    //            }
    //            con_mod.close();
    //
    //        } catch (SQLException e) {
    //            System.out.println(e);
    //        }
    //
         return module_menu_id;
    //        return "1";
     }
     
     //Gettting role detail module id by module menu id and role master id
     public String get_role_detail_module_id() {
         
    //        Connection con_det;
    //
    //        try {
    //            con_det = getConnection();
    //            Statement stmt = con_det.createStatement();
    //            ResultSet rset =
    //            stmt.executeQuery("SELECT * FROM tbl_role_detail_modules where module_menu_id = '" + module_menu_id + "' and role_master_id = '" + role_master_id +"'");
    //
    //            if (rset.next()) {
    //
    //                role_detail_modules_id = (rset.getString("role_detail_modules_id")).toString();
    //
    //                System.out.println(".........get_role_detail_module_id.........function called");
    //                System.out.println(".........Module Menu ID is :..." + module_menu_id + "...");
    //                System.out.println(".........Role Master ID is :..." + role_master_id + "...");
    //                System.out.println(".........Role Detail Module ID is :..." + role_detail_modules_id + "...");
    //                con_det.close();
    //
    //                get_module_view_rights();
    //                return role_detail_modules_id;
    //            } else {
    //                System.out.println("........NO ROLE DETAIL FOUND........");
    //            }
    //            con_det.close();
    //
    //        } catch (SQLException e) {
    //            System.out.println(e);
    //        }
    //
         return role_detail_modules_id;
    //        return "1";
     }
     
     
     //Gettting module view rights by role detail module id
     public String get_module_view_rights() {
         
    //        Connection con_mod_right;
    //
    //        try {
    //            con_mod_right = getConnection();
    //            Statement stmt = con_mod_right.createStatement();
    //            ResultSet rset =
    //            stmt.executeQuery("SELECT * FROM tbl_role_detail_modules where role_detail_modules_id = '" + role_detail_modules_id + "'");
    //
    //            if (rset.next()) {
    //
    //                module_view_rights = (rset.getString("r_view")).toString();
    //
    //                System.out.println(".........get_page_view_rights.........function called");
    //                System.out.println(".........View Rights for Module Menu ID : " + role_detail_modules_id + " against Role Master ID : " + role_master_id );
    //                System.out.println(".........Your Module view rights is : " + module_view_rights);
    //
    //                con_mod_right.close();
    //
    //                return module_view_rights;
    //            } else {
    //                System.out.println("........NO RIGHTS DATA FOUND........");
    //            }
    //            con_mod_right.close();
    //
    //        } catch (SQLException e) {
    //            System.out.println(e);
    //        }
    //
         return module_view_rights;
    //        return "Y";
     }
     
     
     //Gettting page id by page name
     public String get_page_id() {
         
            Connection con_pg;
    
            try {
                con_pg = getConnection();
                Statement stmt = con_pg.createStatement();
                ResultSet rset =
                    stmt.executeQuery("SELECT * FROM tbl_pages where pages_name = '" + page_name +  "'");
    
                if (rset.next()) {
    
                    pages_id = (rset.getString("pages_id")).toString();
    
                    System.out.println(".........get_page_id.........function called");
                    System.out.println(".........Page ID is :..." + pages_id + "...");
                    System.out.println(".........Page NAME is :..." + page_name + "...");
    
                    con_pg.close();
                    return pages_id;
    
                } else {
                    System.out.println("........NO PAGE FOUND........");
                }
                con_pg.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return pages_id;
    //        return "1";
     }
     
     
     //Gettting role detail id by page id and role master id
     public String get_role_detail_pages_id() {
    
            Connection con_det;
    
            try {
                con_det = getConnection();
                Statement stmt = con_det.createStatement();
                ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where pages_id = '" + pages_id + "' and role_master_id = '" + role_master_id +"'");
    
                if (rset.next()) {
    
                    role_detail_pages_id = (rset.getString("role_detail_pages_id")).toString();
    
                    System.out.println(".........get_role_detail_pages_id.........function called");
                    System.out.println(".........Page ID is :..." + pages_id + "...");
                    System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                    System.out.println(".........Role Detail ID is :..." + role_detail_pages_id + "...");
                    con_det.close();
    
                    return role_detail_pages_id;
                } else {
                    System.out.println("........NO ROLE DETAIL FOUND........");
                }
                con_det.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return role_detail_pages_id;
    //        return "1";
     }
     
     
     //Gettting page view rights by role detail id
     public String get_page_view_rights(String getPageName) {
         
         page_name = getPageName;
         get_page_id();
         get_role_detail_pages_id();
         
            Connection con_right;
    
            try {
                con_right = getConnection();
                Statement stmt = con_right.createStatement();
                ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");
    
                if (rset.next()) {
    
                    view_rights = (rset.getString("r_view")).toString();
    
                    System.out.println(".........get_page_view_rights.........function called");
                    System.out.println(".........View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                    System.out.println(".........Your Page view rights is : " + view_rights);
    
                    con_right.close();
    
                    return view_rights;
                } else {
                    System.out.println("........NO RIGHTS DATA FOUND........");
                }
                con_right.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return view_rights;
    //        return "Y";
     }
     
     //Gettting add button view rights by role detail id
     public String get_add_view_rights() {
         
            Connection con_add;
    
            try {
                con_add = getConnection();
                Statement stmt = con_add.createStatement();
                ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");
    
                if (rset.next()) {
    
                    add_rights = (rset.getString("r_add")).toString();
    
                    System.out.println(".........get_add_view_rights.........function called");
                    System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                    System.out.println(".........Your Add rights is : " + add_rights);
    
                    con_add.close();
                    return add_rights;
                } else {
                    System.out.println("........NO RIGHTS DATA FOUND........");
                }
                con_add.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return add_rights;
    //        return "Y";
     }
     
     //Gettting edit button view rights by role detail id
     public String get_edit_view_rights() {
         
            Connection con_edit;
    
            try {
                con_edit = getConnection();
                Statement stmt = con_edit.createStatement();
                ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");
    
                if (rset.next()) {
    
                    edit_rights = (rset.getString("r_edit")).toString();
    
                    System.out.println(".........get_edit_view_rights.........function called");
                    System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                    System.out.println(".........Your Edit rights is : " + edit_rights);
    
                    con_edit.close();
                    return edit_rights;
                } else {
                    System.out.println("........NO RIGHTS DATA FOUND........");
                }
                con_edit.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return edit_rights;
    //        return "Y";
     }
     
     //Gettting delete button view rights by role detail id
     public String get_delete_view_rights() {
         
            Connection con_del;
    
            try {
                con_del = getConnection();
                Statement stmt = con_del.createStatement();
                ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");
    
                if (rset.next()) {
    
                    delete_rights = (rset.getString("r_delete")).toString();
    
                    System.out.println(".........get_delete_view_rights.........function called");
                    System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                    System.out.println(".........Your Delete rights is : " + delete_rights);
    
                    con_del.close();
                    return delete_rights;
                } else {
                    System.out.println("........NO RIGHTS DATA FOUND........");
                }
                con_del.close();
    
            } catch (SQLException e) {
                System.out.println(e);
            }
    
         return delete_rights;
    //        return "Y";
     }    
     
     
     //Gettting save button view rights > hard coded if add,edit or delete privilige found
     public String get_save_view_rights() {
    
            if(add_rights.equals("Y")){
                save_rights = "Y";
                System.out.println("Save right due to add is : Y");
            }
            else if(edit_rights.equals("Y")){
                save_rights = "Y";
                System.out.println("Save right due to edit is : Y");
            }
            else if(delete_rights.equals("Y")){
                save_rights = "Y";
                System.out.println("Save right due to delete is : Y");
            }
            else {
                save_rights = "N";
                System.out.println("Save right due to nothing is : N");
            }
    
          return save_rights;
    //        return "Y";

     }


    public String main() {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
          for(int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
          }
        }
        return "good";
      }
    
    public String getArray (){
      int twoDim [][] = new int [2][3];
      twoDim[0][0]=1;
      twoDim[0][1]=2;
      twoDim[0][2]=3;
      twoDim[1][0]=4;
      twoDim[1][1]=5;
      twoDim[1][2]=6;
      System.out.println(twoDim[0][0] + " " + twoDim[0][1] + " " + twoDim[0][2]);
      System.out.println(twoDim[1][0] + " " + twoDim[1][1] + " " + twoDim[1][2]);
       return "good";
   }
    
    
    
    
    
    
    
    
    
    
}
