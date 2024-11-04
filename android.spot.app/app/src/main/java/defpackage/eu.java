package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eu {
    public static int a(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static Drawable b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    public static void c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static Object j(aov aovVar, Object obj, mol molVar) {
        return molVar.a(obj, aovVar);
    }

    public static boolean k(aov aovVar, moh mohVar) {
        return ((Boolean) mohVar.a(aovVar)).booleanValue();
    }

    public void e(int i, int i2) {
        throw null;
    }

    public void f(int i, int i2) {
        throw null;
    }

    public void h(int i, int i2) {
        g();
    }

    public void d() {
    }

    public void g() {
    }

    public void i(int i, int i2) {
    }
}
