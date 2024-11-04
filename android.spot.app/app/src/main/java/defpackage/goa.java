package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goa {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final jjr h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final String n;
    public final int o;

    public goa() {
        throw null;
    }

    public static gnz a() {
        gnz gnzVar = new gnz();
        gnzVar.e(0L);
        gnzVar.h(0);
        gnzVar.e = jmo.a;
        gnzVar.i(0L);
        gnzVar.g(0L);
        gnzVar.f(0);
        gnzVar.d(0L);
        return gnzVar;
    }

    public static goa d(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, jjr jjrVar, String str6, long j2, long j3, int i3, long j4, String str7) {
        gnz a = a();
        a.e(j);
        a.c(str);
        a.j(i);
        a.a = str2;
        a.b = str3;
        a.c = str4;
        a.h(i2);
        a.d = str5;
        a.e = jjrVar;
        a.f = str6;
        a.i(j2);
        a.g(j3);
        a.f(i3);
        a.d(j4);
        a.g = str7;
        return a.a();
    }

    public final gwf b() {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new gwg(this.b);
                    }
                    return gwq.a;
                }
                return gws.a;
            }
            return new gwh(this.b);
        }
        throw null;
    }

    public final boolean c() {
        return b().b();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        jjr jjrVar;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof goa) {
            goa goaVar = (goa) obj;
            if (this.a == goaVar.a && this.b.equals(goaVar.b)) {
                int i = this.o;
                int i2 = goaVar.o;
                if (i != 0) {
                    if (i == i2 && ((str = this.c) != null ? str.equals(goaVar.c) : goaVar.c == null) && ((str2 = this.d) != null ? str2.equals(goaVar.d) : goaVar.d == null) && ((str3 = this.e) != null ? str3.equals(goaVar.e) : goaVar.e == null) && this.f == goaVar.f && ((str4 = this.g) != null ? str4.equals(goaVar.g) : goaVar.g == null) && ((jjrVar = this.h) != null ? jjrVar.equals(goaVar.h) : goaVar.h == null) && ((str5 = this.i) != null ? str5.equals(goaVar.i) : goaVar.i == null) && this.j == goaVar.j && this.k == goaVar.k && this.l == goaVar.l && this.m == goaVar.m) {
                        String str6 = this.n;
                        String str7 = goaVar.n;
                        if (str6 != null ? str6.equals(str7) : str7 == null) {
                            return true;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        int hashCode7 = ((this.b.hashCode() ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ a.O(this.o);
        String str = this.c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = ((hashCode7 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (((i4 ^ hashCode3) * 1000003) ^ this.f) * 1000003;
        String str4 = this.g;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        jjr jjrVar = this.h;
        if (jjrVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = jjrVar.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        String str5 = this.i;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        long j2 = this.j;
        int i8 = (((i7 ^ hashCode6) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.k;
        int i9 = (((i8 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i10 = (i9 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        String str6 = this.n;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return i10 ^ i2;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("SpecificId", frx.aN(this.b));
        return q.toString();
    }

    public goa(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, jjr jjrVar, String str6, long j2, long j3, int i3, long j4, String str7) {
        this.a = j;
        this.b = str;
        this.o = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = jjrVar;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
    }
}
