import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Img {
@Test
public void m() throws IOException {
	
	File f=new File("C:\\Users\\HP\\Desktop\\CBIPassbook.jpeg");
	File fa=new File("C:\\Users\\HP\\Desktop\\12thMarksheet.jpeg");
	BufferedImage z = ImageIO.read(fa);
	BufferedImage za = ImageIO.read(f);
	ImageDiffer ft=new ImageDiffer();
	ImageDiff p = ft.makeDiff(z, za);
	if(p.hasDiff()) {
		System.out.println("images are not same");
	}else {
		System.out.println("same");
	}
}
}
