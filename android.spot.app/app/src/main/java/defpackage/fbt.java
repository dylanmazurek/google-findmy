package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbt extends fbf {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        fbt fbtVar = (fbt) fbfVar;
        if (!TextUtils.isEmpty(this.a)) {
            fbtVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            fbtVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            fbtVar.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            fbtVar.d = this.d;
        }
        if (!TextUtils.isEmpty(this.e)) {
            fbtVar.e = this.e;
        }
        if (!TextUtils.isEmpty(this.f)) {
            fbtVar.f = this.f;
        }
        if (!TextUtils.isEmpty(this.g)) {
            fbtVar.g = this.g;
        }
        if (!TextUtils.isEmpty(this.h)) {
            fbtVar.h = this.h;
        }
        if (!TextUtils.isEmpty(this.i)) {
            fbtVar.i = this.i;
        }
        if (!TextUtils.isEmpty(this.j)) {
            fbtVar.j = this.j;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.a);
        hashMap.put("source", this.b);
        hashMap.put("medium", this.c);
        hashMap.put("keyword", this.d);
        hashMap.put("content", this.e);
        hashMap.put("id", this.f);
        hashMap.put("adNetworkId", this.g);
        hashMap.put("gclid", this.h);
        hashMap.put("dclid", this.i);
        hashMap.put("aclid", this.j);
        return a(hashMap);
    }
}
