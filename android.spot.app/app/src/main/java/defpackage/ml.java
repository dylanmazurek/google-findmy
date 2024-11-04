package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ml implements mm {
    private final /* synthetic */ int a;

    public ml(int i) {
        this.a = i;
    }

    @Override // defpackage.mm
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                try {
                    return cny.c(context.getResources(), xmlPullParser, attributeSet, theme);
                } catch (Exception e) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                    return null;
                }
            }
            try {
                return cnn.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute == null) {
            return null;
        }
        try {
            Drawable drawable = (Drawable) ml.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
            eu.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
            return drawable;
        } catch (Exception e3) {
            Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
            return null;
        }
    }
}
