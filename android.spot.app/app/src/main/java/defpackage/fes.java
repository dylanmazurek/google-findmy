package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fes extends fhq implements fhu {
    private static final gok a;
    private static final gok l;
    private static final fma m;

    static {
        feq feqVar = new feq();
        m = feqVar;
        l = new gok("GoogleAuthService.API", feqVar, (byte[]) null);
        a = new gok("GoogleAuthServiceClient");
    }

    public fes(Context context) {
        super(context, l, fhk.a, fhp.a);
    }

    public static void a(Status status, Object obj, bym bymVar) {
        if (!fma.bb(status, obj, bymVar)) {
            a.q("The task is already complete.", new Object[0]);
        }
    }
}
