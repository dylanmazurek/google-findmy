package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbs extends fbf {
    public String a;
    public String b;
    public String c;
    public String d;

    @Override // defpackage.fbf
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(fbs fbsVar) {
        if (!TextUtils.isEmpty(this.a)) {
            fbsVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            fbsVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            fbsVar.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            fbsVar.d = this.d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return a(hashMap);
    }
}
