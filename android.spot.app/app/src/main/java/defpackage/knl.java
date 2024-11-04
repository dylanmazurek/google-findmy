package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public knl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        fma.aO(!fmb.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof knl)) {
            return false;
        }
        knl knlVar = (knl) obj;
        if (!amr.g(this.b, knlVar.b) || !amr.g(this.a, knlVar.a) || !amr.g(this.e, knlVar.e) || !amr.g(this.f, knlVar.f) || !amr.g(this.c, knlVar.c) || !amr.g(this.g, knlVar.g) || !amr.g(this.d, knlVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fma.aV("applicationId", this.b, arrayList);
        fma.aV("apiKey", this.a, arrayList);
        fma.aV("databaseUrl", this.e, arrayList);
        fma.aV("gcmSenderId", this.c, arrayList);
        fma.aV("storageBucket", this.g, arrayList);
        fma.aV("projectId", this.d, arrayList);
        return fma.aU(arrayList, this);
    }
}
