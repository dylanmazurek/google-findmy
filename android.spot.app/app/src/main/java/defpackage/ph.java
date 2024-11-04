package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.google.ar.core.ImageMetadata;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ph extends mpe implements mnw {
    private final /* synthetic */ int v;
    public static final ph u = new ph(20);
    public static final ph t = new ph(19);
    public static final ph s = new ph(18);
    public static final ph r = new ph(17);
    public static final ph q = new ph(16);
    public static final ph p = new ph(15);
    public static final ph o = new ph(14);
    public static final ph n = new ph(13);
    public static final ph m = new ph(12);
    public static final ph l = new ph(11);
    public static final ph k = new ph(10);
    public static final ph j = new ph(9);
    public static final ph i = new ph(8);
    public static final ph h = new ph(7);
    public static final ph g = new ph(6);
    public static final ph f = new ph(5);
    public static final ph e = new ph(4);
    public static final ph d = new ph(3);
    public static final ph c = new ph(2);
    public static final ph b = new ph(1);
    public static final ph a = new ph(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(int i2) {
        super(0);
        this.v = i2;
    }

    public static final ol b() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            declaredField3.getClass();
            declaredField.getClass();
            declaredField2.getClass();
            return new on(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return om.a;
        }
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.v) {
            case 0:
                mqa mqaVar = mqb.a;
                return Integer.valueOf(mqb.b.b() + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            case 1:
                return b();
            case 2:
                return true;
            case 3:
                anz anzVar = new anz(ts.h);
                anzVar.a();
                return anzVar;
            case 4:
                return xc.a;
            case 5:
                return null;
            case 6:
                return zq.b;
            case 7:
                return zr.a;
            case 8:
                return zx.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 9:
                return true;
            case 10:
                return new aqx(aqx.a);
            case 11:
                return false;
            case 12:
                return new aae(null);
            case 13:
                return aat.a;
            case 14:
                return new aaj(bArr);
            case 15:
                return false;
            case 16:
                return mlh.a;
            case 17:
                return null;
            case 18:
                return new LinkedHashMap();
            case 19:
                return new ayr(false, 3, null);
            default:
                return false;
        }
    }
}
