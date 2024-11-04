package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggk {
    public final String a;
    public final Long b;
    public final Long c;
    public final lga d;
    public final List e;
    public final Long f;
    public final String g;
    public final lia h;
    public final String i;
    public final String j;
    public final Long k;
    public final long l;
    public final Long m;
    public final lhb n;
    public final List o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;

    public ggk() {
        throw null;
    }

    public static final ggk a(lgf lgfVar) {
        lga lgaVar;
        lga lgaVar2;
        lga lgaVar3;
        lga lgaVar4;
        lga lgaVar5;
        lgfVar.getClass();
        ggh c = c();
        c.f(lgfVar.d);
        lgx lgxVar = lgfVar.h;
        if (lgxVar == null) {
            lgxVar = lgx.e;
        }
        int e = kzy.e(lgxVar.a);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        c.j(e);
        lgx lgxVar2 = lgfVar.h;
        if (lgxVar2 == null) {
            lgxVar2 = lgx.e;
        }
        int w = a.w(lgxVar2.b);
        if (w == 0) {
            w = 1;
        }
        c.i(w);
        lgx lgxVar3 = lgfVar.h;
        if (lgxVar3 == null) {
            lgxVar3 = lgx.e;
        }
        int w2 = a.w(lgxVar3.c);
        if (w2 == 0) {
            w2 = 1;
        }
        c.h(w2);
        lgx lgxVar4 = lgfVar.h;
        if (lgxVar4 == null) {
            lgxVar4 = lgx.e;
        }
        int w3 = a.w(lgxVar4.d);
        if (w3 == 0) {
            w3 = 1;
        }
        c.l(w3);
        c.a = Long.valueOf(lgfVar.j);
        c.b = Long.valueOf(lgfVar.k);
        if (lgfVar.b == 12) {
            lgaVar = (lga) lgfVar.c;
        } else {
            lgaVar = lga.x;
        }
        c.c(lgaVar);
        c.g(lgfVar.i);
        c.c = Long.valueOf(lgfVar.g);
        c.d = lgfVar.l;
        lia liaVar = lgfVar.m;
        if (liaVar == null) {
            liaVar = lia.b;
        }
        c.e = liaVar;
        c.f = lgfVar.n;
        c.g = Long.valueOf(lgfVar.o);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        lix lixVar = lgfVar.p;
        if (lixVar == null) {
            lixVar = lix.c;
        }
        c.d(timeUnit.toMillis(lixVar.a));
        int w4 = a.w(lgfVar.q);
        if (w4 != 0) {
            i = w4;
        }
        c.k(i);
        lhb lhbVar = lgfVar.r;
        if (lhbVar == null) {
            lhbVar = lhb.b;
        }
        c.i = lhbVar;
        if (lgfVar.b == 12) {
            lgaVar2 = (lga) lgfVar.c;
        } else {
            lgaVar2 = lga.x;
        }
        if (!lgaVar2.m.isEmpty()) {
            if (lgfVar.b == 12) {
                lgaVar5 = (lga) lgfVar.c;
            } else {
                lgaVar5 = lga.x;
            }
            c.e(lgaVar5.m);
        }
        if (lgfVar.b == 12) {
            lgaVar3 = (lga) lgfVar.c;
        } else {
            lgaVar3 = lga.x;
        }
        lfx lfxVar = lgaVar3.h;
        if (lfxVar == null) {
            lfxVar = lfx.i;
        }
        if (!lfxVar.e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (lgfVar.b == 12) {
                lgaVar4 = (lga) lgfVar.c;
            } else {
                lgaVar4 = lga.x;
            }
            lfx lfxVar2 = lgaVar4.h;
            if (lfxVar2 == null) {
                lfxVar2 = lfx.i;
            }
            Iterator it = lfxVar2.e.iterator();
            while (it.hasNext()) {
                jer a = ggj.a((lfq) it.next());
                if (a.g()) {
                    arrayList.add(a.c());
                }
            }
            c.b(arrayList);
        }
        return c.a();
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ggk ggkVar = (ggk) it.next();
            ljh k = lfm.e.k();
            String str = ggkVar.a;
            if (!k.b.y()) {
                k.t();
            }
            lfm lfmVar = (lfm) k.b;
            str.getClass();
            lfmVar.a |= 1;
            lfmVar.b = str;
            long longValue = ggkVar.b.longValue();
            if (!k.b.y()) {
                k.t();
            }
            lfm lfmVar2 = (lfm) k.b;
            lfmVar2.a |= 2;
            lfmVar2.c = longValue;
            long longValue2 = ggkVar.f.longValue();
            if (!k.b.y()) {
                k.t();
            }
            lfm lfmVar3 = (lfm) k.b;
            lfmVar3.a |= 4;
            lfmVar3.d = longValue2;
            arrayList.add((lfm) k.q());
        }
        return arrayList;
    }

    public static ggh c() {
        ggh gghVar = new ggh();
        gghVar.c(lga.x);
        gghVar.j(1);
        gghVar.i(1);
        gghVar.h(1);
        gghVar.l(1);
        gghVar.a = 0L;
        gghVar.b = 0L;
        gghVar.g = 0L;
        gghVar.d(0L);
        gghVar.c = 0L;
        gghVar.e("chime_default_group");
        gghVar.h = 0L;
        gghVar.g(Collections.emptyList());
        gghVar.b(Collections.emptyList());
        gghVar.k(1);
        return gghVar;
    }

    public final boolean equals(Object obj) {
        String str;
        lia liaVar;
        String str2;
        lhb lhbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggk) {
            ggk ggkVar = (ggk) obj;
            if (this.a.equals(ggkVar.a)) {
                int i = this.p;
                int i2 = ggkVar.p;
                if (i != 0) {
                    if (i == i2) {
                        int i3 = this.q;
                        int i4 = ggkVar.q;
                        if (i3 != 0) {
                            if (i3 == i4) {
                                int i5 = this.r;
                                int i6 = ggkVar.r;
                                if (i5 != 0) {
                                    if (i5 == i6) {
                                        int i7 = this.s;
                                        int i8 = ggkVar.s;
                                        if (i7 != 0) {
                                            if (i7 == i8 && this.b.equals(ggkVar.b) && this.c.equals(ggkVar.c) && this.d.equals(ggkVar.d) && this.e.equals(ggkVar.e) && this.f.equals(ggkVar.f) && ((str = this.g) != null ? str.equals(ggkVar.g) : ggkVar.g == null) && ((liaVar = this.h) != null ? liaVar.equals(ggkVar.h) : ggkVar.h == null) && ((str2 = this.i) != null ? str2.equals(ggkVar.i) : ggkVar.i == null) && this.j.equals(ggkVar.j) && this.k.equals(ggkVar.k) && this.l == ggkVar.l && this.m.equals(ggkVar.m)) {
                                                int i9 = this.t;
                                                int i10 = ggkVar.t;
                                                if (i9 != 0) {
                                                    if (i9 == i10 && ((lhbVar = this.n) != null ? lhbVar.equals(ggkVar.n) : ggkVar.n == null) && this.o.equals(ggkVar.o)) {
                                                        return true;
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
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
        int i;
        int hashCode;
        int i2;
        int hashCode2;
        int hashCode3 = this.a.hashCode() ^ 1000003;
        int i3 = this.p;
        a.V(i3);
        int i4 = this.q;
        a.V(i4);
        int i5 = this.r;
        a.V(i5);
        int i6 = this.s;
        a.V(i6);
        int hashCode4 = (((((((((((hashCode3 * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        lga lgaVar = this.d;
        if (lgaVar.y()) {
            i = lgaVar.i();
        } else {
            int i7 = lgaVar.y;
            if (i7 == 0) {
                i7 = lgaVar.i();
                lgaVar.y = i7;
            }
            i = i7;
        }
        int hashCode5 = ((((((hashCode4 * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode5 ^ hashCode) * 1000003;
        lia liaVar = this.h;
        if (liaVar == null) {
            i2 = 0;
        } else if (liaVar.y()) {
            i2 = liaVar.i();
        } else {
            int i10 = liaVar.y;
            if (i10 == 0) {
                i10 = liaVar.i();
                liaVar.y = i10;
            }
            i2 = i10;
        }
        int i11 = (i9 ^ i2) * 1000003;
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        long j = this.l;
        int hashCode7 = (((hashCode6 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.m.hashCode()) * 1000003;
        int i12 = this.t;
        a.V(i12);
        int i13 = (hashCode7 ^ i12) * 1000003;
        lhb lhbVar = this.n;
        if (lhbVar != null) {
            if (lhbVar.y()) {
                i8 = lhbVar.i();
            } else {
                i8 = lhbVar.y;
                if (i8 == 0) {
                    i8 = lhbVar.i();
                    lhbVar.y = i8;
                }
            }
        }
        return ((i13 ^ i8) * 1000003) ^ this.o.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int i = this.p;
        String str5 = "null";
        if (i == 0) {
            str = "null";
        } else {
            str = kzy.f(i);
        }
        int i2 = this.q;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = kzy.g(i2);
        }
        int i3 = this.r;
        if (i3 == 0) {
            str3 = "null";
        } else {
            str3 = kzy.h(i3);
        }
        int i4 = this.s;
        if (i4 == 0) {
            str4 = "null";
        } else {
            str4 = kzv.L(i4);
        }
        lga lgaVar = this.d;
        List list = this.e;
        lia liaVar = this.h;
        int i5 = this.t;
        String valueOf = String.valueOf(lgaVar);
        String valueOf2 = String.valueOf(list);
        String valueOf3 = String.valueOf(liaVar);
        if (i5 != 0) {
            str5 = Integer.toString(a.s(i5));
        }
        lhb lhbVar = this.n;
        List list2 = this.o;
        return "ChimeThread{id=" + this.a + ", readState=" + str + ", deletionStatus=" + str2 + ", countBehavior=" + str3 + ", systemTrayBehavior=" + str4 + ", lastUpdatedVersion=" + this.b + ", lastNotificationVersion=" + this.c + ", androidSdkMessage=" + valueOf + ", notificationMetadataList=" + valueOf2 + ", creationId=" + this.f + ", payloadType=" + this.g + ", payload=" + valueOf3 + ", updateThreadStateToken=" + this.i + ", groupId=" + this.j + ", expirationTimestampUsec=" + this.k + ", expirationDurationAfterDisplayMs=" + this.l + ", insertionTimeMs=" + this.m + ", storageMode=" + str5 + ", schedule=" + String.valueOf(lhbVar) + ", actionList=" + String.valueOf(list2) + "}";
    }

    public ggk(String str, int i, int i2, int i3, int i4, Long l, Long l2, lga lgaVar, List list, Long l3, String str2, lia liaVar, String str3, String str4, Long l4, long j, Long l5, int i5, lhb lhbVar, List list2) {
        this.a = str;
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.b = l;
        this.c = l2;
        this.d = lgaVar;
        this.e = list;
        this.f = l3;
        this.g = str2;
        this.h = liaVar;
        this.i = str3;
        this.j = str4;
        this.k = l4;
        this.l = j;
        this.m = l5;
        this.t = i5;
        this.n = lhbVar;
        this.o = list2;
    }
}
