
package com.mycompany.studentlist;

/**
 *
 * @author Master
 */
class Student {
    
    private int id;
    private String name;
    private String programName;
    
    public int getId(){
        return id;
    }
 
    void setName(String jason) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the prgramName
     */
    public String getPrgramName() {
        return programName;
    }

    /**
     * @param prgramName the prgramName to set
     */
    public void setPrgramName(String prgramName) {
        this.programName = programName;
    }
           
}
