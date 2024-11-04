package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgm extends cgo {
    public static cgm a;
    public static final cgt b = new cgc();
    private final Application e;

    public cgm(Application application) {
        this.e = application;
    }

    private static final cgk d(Class cls, Application application) {
        if (cef.class.isAssignableFrom(cls)) {
            try {
                cgk cgkVar = (cgk) cls.getConstructor(Application.class).newInstance(application);
                cgkVar.getClass();
                return cgkVar;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            } catch (NoSuchMethodException e3) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
            } catch (InvocationTargetException e4) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
            }
        }
        return bvn.d(cls);
    }

    @Override // defpackage.cgo, defpackage.cgn
    public final cgk a(Class cls) {
        Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.cgo, defpackage.cgn
    public final cgk b(Class cls, cgu cguVar) {
        if (this.e != null) {
            return a(cls);
        }
        Application application = (Application) cguVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (!cef.class.isAssignableFrom(cls)) {
            return bvn.d(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public cgm() {
        this(null);
    }
}
