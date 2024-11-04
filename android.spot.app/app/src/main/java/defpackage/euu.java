package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class euu extends cef {
    public static final jnk b = jnk.l("com/google/android/apps/adm/map/MainMapViewModel");
    public final cfn c;
    public final Executor d;
    public final fma e;

    public euu(Application application, fma fmaVar, Executor executor) {
        super(application);
        this.c = new cfn(jmo.a);
        this.e = fmaVar;
        this.d = executor;
    }
}
