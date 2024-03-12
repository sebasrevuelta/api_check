public class ActiveDebugCode {
    public void bad(){
        Exception e = new Exception();
        // ruleid: active-debug-code-printstacktrace
        e.printStackTrace();
    }
}
