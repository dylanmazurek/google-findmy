package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvn {
    static PointerIcon a(Bitmap bitmap, float f, float f2) {
        PointerIcon create;
        create = PointerIcon.create(bitmap, f, f2);
        return create;
    }

    public static PointerIcon b(Context context, int i) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(context, i);
        return systemIcon;
    }

    static PointerIcon c(Resources resources, int i) {
        PointerIcon load;
        load = PointerIcon.load(resources, i);
        return load;
    }

    public static final cgk d(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (cgk) newInstance;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }
}
