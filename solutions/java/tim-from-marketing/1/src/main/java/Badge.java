class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();
        if(id==null){
        }
        else{
            sb.append(String.format("[%d] - ",id));
        }
        sb.append(String.format("%s - ",name));
        if(department==null){
            sb.append(String.format("OWNER"));
        }
        else{
            sb.append(String.format("%s",department.toUpperCase()));
        }
        return sb.toString();
    }
}
