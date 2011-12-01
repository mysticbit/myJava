/*Logger pg 148 */

class Logger {
    private String format;
    
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        if ( (format.equals("common")) ! (format.equals("combined")) ) {
            this.format = format;
        }
    }
    
}


