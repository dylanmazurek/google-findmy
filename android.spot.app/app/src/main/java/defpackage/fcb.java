package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcb extends fbf {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        fcb fcbVar = (fcb) fbfVar;
        if (!TextUtils.isEmpty(this.a)) {
            fcbVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            fcbVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            fcbVar.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            fcbVar.d = this.d;
        }
        if (this.e) {
            fcbVar.e = true;
        }
        TextUtils.isEmpty(null);
        if (this.f) {
            fcbVar.f = true;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.a);
        hashMap.put("clientId", this.b);
        hashMap.put("userId", this.c);
        hashMap.put("androidAdId", this.d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
        hashMap.put("sessionControl", null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return a(hashMap);
    }
}
