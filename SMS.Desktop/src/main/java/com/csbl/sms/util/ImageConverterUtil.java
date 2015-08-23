
package main.java.com.csbl.sms.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import javax.imageio.ImageIO;

public class ImageConverterUtil {
    
    private static final int IMG_WIDTH = 400;
    private static final int IMG_HEIGHT = 400;
    
    public static BufferedImage resizeImage(BufferedImage originalImage, int type) {

        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);

        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        return resizedImage;
    }
    
    
    public static String getPicturePathForStudent(String originalPath, String studentId)
    {
        String convertedPath;
        try{
            
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("path.properties");
            props.load(inputStream);
            
            BufferedImage originalImage = ImageIO.read(new File(originalPath));
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
            BufferedImage resizeImageJpg = ImageConverterUtil.resizeImage(originalImage, type);
            File folder = new File(props.getProperty("path.Student"));
            if(!folder.exists())
            {
                folder.mkdir();
            }

            convertedPath = props.getProperty("path.Student")+"\\"+studentId+".png";
            boolean write = ImageIO.write(resizeImageJpg, "png", new File(convertedPath));
            if(write == false) {
                    return "unsuccessful";
                }
        
        }catch(Exception e){
            return "unsuccessful";
        }
        return convertedPath;
    }
    
    public static String getPicturePathForEmployee(String originalPath, String employeeId)
    {
        String convertedPath;
        try{
            
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("path.properties");
            props.load(inputStream);
            
            BufferedImage originalImage = ImageIO.read(new File(originalPath));
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
            BufferedImage resizeImageJpg = ImageConverterUtil.resizeImage(originalImage, type);
            File folder = new File(props.getProperty("path.Employee"));
            if(!folder.exists())
            {
                folder.mkdir();
            }

            convertedPath = props.getProperty("path.Employee")+"\\"+employeeId+".png";
            boolean write = ImageIO.write(resizeImageJpg, "png", new File(convertedPath));
            if(write == false) {
                    return "unsuccessful";
                }
        
        }catch(Exception e){
            return "unsuccessful";
        }
        return convertedPath;
    }
}
