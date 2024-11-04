package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ka {
    public static final Field a;

    static {
        NoSuchFieldException e;
        Field field;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
        } catch (NoSuchFieldException e2) {
            e = e2;
            field = null;
        }
        try {
            field.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e = e3;
            e.printStackTrace();
            a = field;
        }
        a = field;
    }
}
