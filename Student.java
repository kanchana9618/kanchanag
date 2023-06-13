package com.example.kanchanag;
public class Student {
    private String stdId;
    private String name;
    private String branch;
    private double fee;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((branch == null) ? 0 : branch.hashCode());
        result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(fee);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (branch == null) {
            if (other.branch != null)
                return false;
        } else if (!branch.equals(other.branch))
            return false;
        if (stdId == null) {
            if (other.stdId != null)
                return false;
        } else if (!stdId.equals(other.stdId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(fee)!= Double.doubleToLongBits(other.fee))
            return false;
        return true;
    }

}
