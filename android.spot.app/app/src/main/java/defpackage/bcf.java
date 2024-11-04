package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcf extends mpe implements mnw {
    private final /* synthetic */ int s;
    public static final bcf r = new bcf(20);
    public static final bcf q = new bcf(19);
    public static final bcf p = new bcf(18);
    public static final bcf o = new bcf(16);
    public static final bcf n = new bcf(15);
    public static final bcf m = new bcf(14);
    public static final bcf l = new bcf(11);
    public static final bcf k = new bcf(10);
    public static final bcf j = new bcf(9);
    public static final bcf i = new bcf(8);
    public static final bcf h = new bcf(7);
    public static final bcf g = new bcf(6);
    public static final bcf f = new bcf(5);
    public static final bcf e = new bcf(4);
    public static final bcf d = new bcf(3);
    public static final bcf c = new bcf(2);
    public static final bcf b = new bcf(1);
    public static final bcf a = new bcf(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcf(int i2) {
        super(0);
        this.s = i2;
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        Class<?> returnType;
        switch (this.s) {
            case 0:
                return false;
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                bcg.a("LocalTextToolbar");
                throw new mks();
            case 5:
                bcg.a("LocalUriHandler");
                throw new mks();
            case 6:
                bcg.a("LocalViewConfiguration");
                throw new mks();
            case 7:
                bcg.a("LocalWindowInfo");
                throw new mks();
            case 8:
            case 9:
                return false;
            case 10:
                return bgi.d;
            case 11:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 12:
                return mlh.a;
            case 13:
                return mlh.a;
            case 14:
                return true;
            case 15:
                try {
                    String[] strArr = ckl.a;
                    Method c2 = bzm.c();
                    if (c2 == null || (returnType = c2.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused) {
                    return null;
                }
            case 16:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
            case 17:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 18:
                return new Handler(Looper.getMainLooper());
            case 19:
                return new aea(0);
            default:
                return new ady(0.0f);
        }
    }
}
