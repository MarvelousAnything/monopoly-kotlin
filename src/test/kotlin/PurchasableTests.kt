import com.marvelousanything.monopoly.Property
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.string.startWith
import java.awt.Color

val testProperty = Property("test", 100, Color.WHITE, IntArray(5) { it * 4 }, null, 100)

class PropertyTests : StringSpec({
    "property should have name" {
        testProperty.name should startWith("test")
    }
})