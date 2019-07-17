package view.report;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


public class cluster_detail_report {

    private static String gotPhase;
    private static String gotCrop;
    private static String gotCity;
    private static String selectedReportType;


    public cluster_detail_report() {
    }
    String param1;
    String reportType;

    public Object gen_cluster_detail_report() {
        // Add event code here...

        selectedReportType = getReportType();
        if (selectedReportType == null) {
            selectedReportType = "notSelected";
       }
        OracleReportBean reportBean = new OracleReportBean("203.223.173.235", "8888", null);

        //        reportBean.setReportURLName("userid=ir19/ir19@orcl&domain=classicdomain&report=C:/ERP/ir19/REPORTS/ReportsGl/SALE_INVOICE&");
        String url = "";
        switch (selectedReportType) {
        case "phaseWise":
            System.out.println("phaseWise");
            reportBean.setReportURLName("userid=emfp/emfp@orcl&domain=classicdomain&report=D:/EMFP_Reports/Cluster_Detail_Phase_Wise&");
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                            "CACHE"); // which will be one of the [cashe - file - mail - printer]
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                            "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
            //        StringBuilder var = new StringBuilder();
            //        var.append("and tbl_LSALES_M.LSALES_M_CODE=");
            //        var.append(getParam1());
            //        reportBean.setReportParameter("and", var.toString());
            //        reportBean.setReportParameter("paramform", "no");
            url = reportBean.getReportServerURL();
            System.out.println("Url => " + url);
            reportBean.openUrlInNewWindow(url);
            break;
        case "cropWise":
            System.out.println("cropWise");
            reportBean.setReportURLName("userid=emfp/emfp@orcl&domain=classicdomain&report=D:/EMFP_Reports/Cluster_Detail_Crop_Wise&");
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                            "CACHE"); // which will be one of the [cashe - file - mail - printer]
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                            "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
            url = reportBean.getReportServerURL();
            System.out.println("Url => " + url);
            reportBean.openUrlInNewWindow(url);
            break;
        case "cityWise":
            System.out.println("cityWise");
            reportBean.setReportURLName("userid=emfp/emfp@orcl&domain=classicdomain&report=D:/EMFP_Reports/Cluster_Detail_City_Wise&");
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                            "CACHE"); // which will be one of the [cashe - file - mail - printer]
            reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                            "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
            url = reportBean.getReportServerURL();
            System.out.println("Url => " + url);
            reportBean.openUrlInNewWindow(url);
            break;
        case "notSelected":
            showMessage("Please Select Report Type");
            break;
        case "null":
            showMessage("Please Select Report Type");
            break;
        default:
            showMessage("Please Select Report Type");
            break;
        }


        return null;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam1() {
        return param1;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }

    public void get_selected_phase(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        gotPhase = (valueChangeEvent.getNewValue()).toString();
        System.out.println("Selected Phase is : " + gotPhase);
    }

    public void get_selected_crop(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        gotCrop = (valueChangeEvent.getNewValue()).toString();
        System.out.println("Selected Crop is : " + gotCrop);
    }

    public void get_selected_city(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        gotCity = (valueChangeEvent.getNewValue()).toString();
        System.out.println("Selected City is : " + gotCity);
    }

    public String showMessage(String msgs) {
        String messageText = msgs;
        FacesMessage fm = new FacesMessage(messageText);
        /**
             * set the type of the message.
             * Valid types: error, fatal,info,warning
             */
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }
}
