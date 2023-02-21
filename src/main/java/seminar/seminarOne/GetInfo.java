package seminar.seminarOne;

public class GetInfo {
    private Human human;
    public String getInfoMother() {
        if(human.getMother() != null) {
            return human.getMother().getFirstName();
        }
        return "no name";
    }
    public String getInfoFather() {
        if(human.getFather() != null) {
            return human.getFather().getFirstName();
        }
        return "no name";
    }
    public String getInfoChild() {
        StringBuilder str = new StringBuilder();
        if(human.getChildren().size() != 0) {
            str.append(human.getChildren().get(0).getFirstName());
            for (int i = 1; i < human.getChildren().size(); i++) {
                str.append(",");
                str.append(human.getChildren().get(i).getFirstName());
            }
        }
        else {
            str.append("no child");
        }
        return str.toString();
    }
}
