package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kqr(kdo kdoVar) {
        this.b = kdoVar.f;
        this.e = kdoVar.a;
        this.f = kdoVar.e;
        this.d = kdoVar.b;
        this.a = kdoVar.c;
        this.c = kdoVar.d;
    }

    public static final fxs b(fxs fxsVar) {
        return fxsVar.a(kqn.a, new fqx(3));
    }

    private final String d() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((knh) this.a).f().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [kqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, krd] */
    /* JADX WARN: Type inference failed for: r4v10, types: [kqz, java.lang.Object] */
    public final fxs a(String str, String str2, String str3, Bundle bundle) {
        int b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", ((knh) this.a).d().b);
        bundle.putString("gmsv", Integer.toString(((kqs) this.b).a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((kqs) this.b).c());
        bundle.putString("app_ver_name", ((kqs) this.b).d());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String str4 = ((krh) fma.p(this.f.j())).a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        kql kqlVar = (kql) this.e.a();
        kti ktiVar = (kti) this.d.a();
        if (kqlVar != null && ktiVar != null && (b = kqlVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(kne.v(b)));
            bundle.putString("Firebase-Client", ktiVar.a());
        }
        return ((fgk) this.c).b(bundle);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    public final List c(OutputStream outputStream) {
        iju ijuVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.d.isEmpty()) {
            ?? r1 = this.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ilc b = ((ild) it.next()).b();
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            if (!arrayList2.isEmpty()) {
                ijuVar = new iju(outputStream, arrayList2);
            } else {
                ijuVar = null;
            }
            if (ijuVar != null) {
                arrayList.add(ijuVar);
            }
        }
        for (ile ileVar : this.f) {
            arrayList.add(ileVar.d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public kqr(knh knhVar, kqs kqsVar, fgk fgkVar, kqz kqzVar, kqz kqzVar2, krd krdVar) {
        this.a = knhVar;
        this.b = kqsVar;
        this.c = fgkVar;
        this.d = kqzVar;
        this.e = kqzVar2;
        this.f = krdVar;
    }

    public kqr(haw hawVar, hix hixVar, lnh lnhVar, hjp hjpVar, hbg hbgVar) {
        this.c = hawVar;
        this.b = hixVar;
        ljh ljhVar = (ljh) lnhVar.z(5);
        ljhVar.w(lnhVar);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lnh lnhVar2 = (lnh) ljhVar.b;
        lnhVar2.b = 3;
        lnhVar2.a |= 1;
        this.f = (lnh) ljhVar.q();
        ljh ljhVar2 = (ljh) lnhVar.z(5);
        ljhVar2.w(lnhVar);
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        lnh lnhVar3 = (lnh) ljhVar2.b;
        lnhVar3.b = 4;
        lnhVar3.a |= 1;
        this.d = (lnh) ljhVar2.q();
        this.e = hjpVar;
        this.a = hbgVar;
    }

    public kqr(jck jckVar) {
        lry lryVar = new lry(jckVar, 1);
        this.f = lryVar;
        lsm d = lsg.d(new hpb(lryVar, 13));
        this.e = d;
        lsm d2 = lsg.d(new hor(lryVar, d, 12));
        this.b = d2;
        lsm d3 = lsg.d(new hpb(lryVar, 11));
        this.c = d3;
        lsm d4 = lsg.d(new gwa(d2, d3, lryVar, 18, (float[]) null));
        this.a = d4;
        this.d = lsg.d(new hpb(d4, 12));
    }

    public kqr(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6) {
        mkoVar.getClass();
        this.c = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
        mkoVar3.getClass();
        this.d = mkoVar3;
        mkoVar4.getClass();
        this.f = mkoVar4;
        mkoVar5.getClass();
        this.a = mkoVar5;
        mkoVar6.getClass();
        this.e = mkoVar6;
    }
}
