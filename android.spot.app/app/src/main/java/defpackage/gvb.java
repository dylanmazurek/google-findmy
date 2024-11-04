package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvb implements lsh {
    private final mko a;

    public gvb(mko mkoVar) {
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        MessageDigest messageDigest;
        byte[] digest;
        Context b = ((lry) this.a).b();
        try {
            PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0 && (messageDigest = MessageDigest.getInstance("SHA-1")) != null && (digest = messageDigest.digest(packageInfo.signatures[0].toByteArray())) != null) {
                return jtf.f.k(digest);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
