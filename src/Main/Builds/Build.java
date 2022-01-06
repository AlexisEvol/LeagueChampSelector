package Main.Builds;

/**
 *
 * @author alexi
 */
public class Build {

    String name;
    String image;
    
    public Build(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Build{" + "name=" + name + ", image=" + image + '}';
    }
}
