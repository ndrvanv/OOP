package seminar.seminarOne;

public class GetInfo {
    private Parents mother;
    private Parents father;
    private Children children;
    public String getInfoMother() {
        if(mother.getMother() != null) {
            return mother.getMother();
        }
        return "no name";
    }
    public String getInfoFather() {
        if(father.getFather() != null) {
            return father.getFather();
        }
        return "no name";
    }
    public String getInfoChild() {
        StringBuilder str = new StringBuilder();
        if(children.getChildren().size() != 0) {
            str.append(children.getChildren().get(0).getFirstName());
            for (int i = 1; i < children.getChildren().size(); i++) {
                str.append(",");
                str.append(children.getChildren().get(i).getFirstName());
            }
        }
        else {
            str.append("no child");
        }
        return str.toString();
    }
}
