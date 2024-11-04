package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.DeleteFileRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyh implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [ktp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v24, types: [lkq, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        ComponentName componentName = null;
        int i2 = 0;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                lqc lqcVar = (lqc) obj;
                if ((lqcVar.a & 8) != 0) {
                    File file = new File(((eyi) this.a).c, eyf.j(lqcVar));
                    ljn ljnVar = (ljn) obj;
                    ljh ljhVar = (ljh) ljnVar.z(5);
                    ljhVar.w(ljnVar);
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    lqc lqcVar2 = (lqc) ljhVar.b;
                    lqcVar2.a &= -9;
                    lqcVar2.i = lqc.j.i;
                    ljh k = lpx.e.k();
                    String uri = Uri.fromFile(file).toString();
                    if (!k.b.y()) {
                        k.t();
                    }
                    lpx lpxVar = (lpx) k.b;
                    uri.getClass();
                    lpxVar.b = uri;
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    lqc lqcVar3 = (lqc) ljhVar.b;
                    lpx lpxVar2 = (lpx) k.q();
                    lpxVar2.getClass();
                    lqcVar3.h = lpxVar2;
                    lqcVar3.a |= 4;
                    obj = (lqc) ljhVar.q();
                    lim limVar = lqcVar.i;
                    if (!file.exists()) {
                        try {
                            if (!file.createNewFile()) {
                                ((jni) ((jni) eyi.a.g()).j("com/google/android/apps/adm/util/ImageBytesHelper", "storeImageBytes", 65, "ImageBytesHelper.java")).r("Failed to create file");
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            limVar.o(fileOutputStream);
                            fileOutputStream.close();
                        } catch (Exception e) {
                            ((jni) ((jni) ((jni) eyi.a.f()).i(e)).j("com/google/android/apps/adm/util/ImageBytesHelper", "storeImageBytes", 'G', "ImageBytesHelper.java")).r("Failed to save image bytes");
                        }
                    }
                }
                return obj;
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a;
                boolean z = lottieAnimationView.d;
                Object obj2 = this.b;
                if (z) {
                    return cyg.a(lottieAnimationView.getContext(), (String) obj2, "asset_".concat(String.valueOf(obj2)));
                }
                return cyg.a(lottieAnimationView.getContext(), (String) obj2, null);
            case 2:
                Object obj3 = this.a;
                fhq fhqVar = (fhq) ((jfh) ((fsr) this.b).a).a;
                DeleteFileRequest deleteFileRequest = new DeleteFileRequest((Uri) obj3);
                fjy fjyVar = new fjy();
                fjyVar.a = new fsw(deleteFileRequest, i2);
                fjyVar.b = new Feature[]{fpj.f};
                fjyVar.c = 7802;
                return (Void) fma.p(fhqVar.f(fjyVar.a()));
            case 3:
                ?? r0 = this.b;
                ArrayList arrayList = new ArrayList(r0.size());
                for (gbf gbfVar : r0) {
                    Object obj4 = this.a;
                    arrayList.add(new gok(gbfVar, ((gbd) obj4).b.a(gbfVar), (byte[]) null));
                }
                return arrayList;
            case 4:
                frx.t(this.a);
                return this.b;
            case 5:
                frx.t(this.a);
                return this.b;
            case 6:
                Object obj5 = this.b;
                ghe gheVar = (ghe) this.a;
                goa goaVar = (goa) obj5;
                gheVar.b(goaVar, true);
                gheVar.c(goaVar, false);
                return mlh.a;
            case 7:
                gkp gkpVar = new gkp((gks) this.a);
                gkpVar.d(fma.i().toEpochMilli());
                gks a = gkpVar.a();
                String str = a.b;
                gkz gkzVar = (gkz) this.b;
                gks gksVar = (gks) bwr.c(((gli) gkzVar.d()).a, true, false, new glf(str, 0));
                if (gksVar == null) {
                    ((Long) bwr.c(((gli) gkzVar.a.w()).a, false, true, new glf(a, 1))).longValue();
                    return gku.INSERTED;
                }
                if (gksVar.c < a.c) {
                    gle d = gkzVar.d();
                    long j = gksVar.a;
                    gkp gkpVar2 = new gkp(a);
                    gkpVar2.b(j);
                    gli gliVar = (gli) d;
                    bwr.c(gliVar.a, false, true, new glg(gliVar, gkpVar2.a(), 1));
                    return gku.REPLACED;
                }
                return gku.REJECTED_SAME_VERSION;
            case 8:
                return ((gqo) this.b).d((gqe) this.a);
            case 9:
                lyn lynVar = new lyn((byte[]) null);
                ?? r4 = this.b;
                Object obj6 = this.a;
                try {
                    kpb g = ((hvq) ((bqm) obj6).d).g();
                    Object obj7 = ((bqm) obj6).e;
                    ikx ikxVar = new ikx(r4);
                    ikxVar.a = new lyn[]{lynVar};
                } catch (IOException | RuntimeException e2) {
                    bqm bqmVar = (bqm) obj6;
                    hqt.b(Level.WARNING, ((hvq) bqmVar.d).b(), e2, "Failed to update snapshot for %s flags may be stale.", bqmVar.b);
                }
                return null;
            case 10:
                this.b.close();
                return ivc.M(this.a);
            case 11:
                this.b.close();
                return ivc.M(this.a);
            case 12:
                jde c = jde.c();
                c.b.offer(this.b);
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                Object obj8 = this.a;
                Context context = (Context) obj8;
                intent.setPackage(context.getPackageName());
                String a2 = c.a(context, intent);
                if (a2 != null) {
                    intent.setClassName(context.getPackageName(), a2);
                }
                try {
                    if (!c.b((Context) obj8)) {
                        componentName = ((Context) obj8).startService(intent);
                    } else {
                        synchronized (ksw.b) {
                            ksw.a((Context) obj8);
                            boolean d2 = ksw.d(intent);
                            ksw.c(intent, true);
                            ComponentName startService = ((Context) obj8).startService(intent);
                            if (startService != null) {
                                if (!d2) {
                                    ksw.c.a(ksw.a);
                                }
                                componentName = startService;
                            }
                        }
                    }
                    if (componentName == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e3) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e3.toString()));
                    i = 402;
                } catch (SecurityException e4) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e4);
                    i = 401;
                }
                return Integer.valueOf(i);
            default:
                return ((kuv) ((kuu) this.b).a.b).a(kus.c(kus.a(this.a)));
        }
    }

    public /* synthetic */ eyh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
