package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzy {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(fzl fzlVar, lrs lrsVar) {
        final Executor threadPoolExecutor;
        final fwn fwnVar = new fwn(fzlVar.a);
        String valueOf = String.valueOf(fzlVar.a.getPackageName());
        Context context = fzlVar.a;
        if (lrsVar.a == null) {
            try {
                lrsVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                lrsVar.a = -1;
            }
        }
        final String concat = "com.google.android.libraries.consentverifier#".concat(valueOf);
        final int intValue = ((Integer) lrsVar.a).intValue();
        final String[] strArr = c;
        fjy fjyVar = new fjy();
        fjyVar.a = new fju() { // from class: fwm
            @Override // defpackage.fju
            public final void a(Object obj, Object obj2) {
                fwo fwoVar = new fwo((bym) obj2, 0);
                fwp fwpVar = (fwp) ((fwq) obj).v();
                Parcel a2 = fwpVar.a();
                duh.d(a2, fwoVar);
                a2.writeString(concat);
                a2.writeInt(intValue);
                a2.writeStringArray(strArr);
                a2.writeByteArray(null);
                fwpVar.c(1, a2);
            }
        };
        fxs f = fwnVar.f(fjyVar.a());
        if (fzo.a(fzlVar.a)) {
            frx frxVar = fqv.a;
            threadPoolExecutor = frx.m(10, Executors.defaultThreadFactory());
        } else {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            lzt lztVar = new lzt(null, null, null);
            lztVar.s("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, lzt.z(lztVar), gab.a);
        }
        try {
            f.o(threadPoolExecutor, new fxo() { // from class: fzx
                @Override // defpackage.fxo
                public final void d(Object obj) {
                    fxs n;
                    boolean z = fzy.a;
                    fwn fwnVar2 = fwn.this;
                    int g = fgq.d.g(fwnVar2.b, 12451000);
                    String str = concat;
                    if (g == 0) {
                        fjy fjyVar2 = new fjy();
                        fjyVar2.a = new fpx(str, 8);
                        n = fwnVar2.f(fjyVar2.a());
                    } else {
                        n = fma.n(new fhn(new Status(16)));
                    }
                    n.m(threadPoolExecutor, new fqd(str, 2));
                }
            });
            f.m(threadPoolExecutor, new fqd(concat, 3));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, e));
        }
    }
}
