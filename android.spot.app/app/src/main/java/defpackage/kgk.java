package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgk implements kgo {
    public final String a;
    public final knb b;
    public final lim c;
    public final kjg d;
    public final kjr e;
    public final Integer f;

    private kgk(String str, knb knbVar, lim limVar, kjg kjgVar, kjr kjrVar, Integer num) {
        this.a = str;
        this.b = knbVar;
        this.c = limVar;
        this.d = kjgVar;
        this.e = kjrVar;
        this.f = num;
    }

    public static kgk a(String str, lim limVar, kjg kjgVar, kjr kjrVar, Integer num) {
        if (kjrVar == kjr.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new kgk(str, kgt.a(str), limVar, kjgVar, kjrVar, num);
    }
}
