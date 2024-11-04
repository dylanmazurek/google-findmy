package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnv {
    private Context a;
    private ILoadedInstanceCreator b;
    private final lnw c;

    public lnv(lnw lnwVar) {
        this.c = lnwVar;
    }

    private static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.dynamite.LoadedInstanceCreator", e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.dynamite.LoadedInstanceCreator", e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("No constructor for dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e5);
        }
    }

    public final synchronized Context a(Context context) {
        if (this.a == null) {
            try {
                this.a = context.createPackageContext(this.c.a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new lnu();
            }
        }
        return this.a;
    }

    public final synchronized ILoadedInstanceCreator b(Context context) {
        ILoadedInstanceCreator lnsVar;
        if (this.b == null) {
            IBinder c = c(a(context).getClassLoader());
            if (c == null) {
                lnsVar = null;
            } else {
                IInterface queryLocalInterface = c.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    lnsVar = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    lnsVar = new lns(c);
                }
            }
            this.b = lnsVar;
        }
        return this.b;
    }
}
