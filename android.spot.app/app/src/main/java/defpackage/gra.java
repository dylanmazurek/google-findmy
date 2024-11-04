package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gra implements gqz {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final ddg c;

    public gra(Context context, ddg ddgVar, gwb gwbVar) {
        ddgVar.getClass();
        this.b = context;
        this.c = ddgVar;
        gwbVar.a(context);
    }

    @Override // defpackage.gqz
    public final void a(grb grbVar) {
        goa goaVar;
        ffc p;
        ljh k = lce.d.k();
        k.getClass();
        ljh k2 = lcd.e.k();
        k2.getClass();
        ljh k3 = lcc.l.k();
        k3.getClass();
        Collections.unmodifiableList(((lcc) k3.b).b).getClass();
        k3.F(grbVar.l);
        String str = grbVar.c.a;
        str.getClass();
        if (!k3.b.y()) {
            k3.t();
        }
        lcc lccVar = (lcc) k3.b;
        lccVar.a |= 1;
        lccVar.c = str;
        gur gurVar = grbVar.e;
        if (grbVar.g == null && !TextUtils.isEmpty(grbVar.n)) {
            gnz a2 = goa.a();
            a2.b(gws.a);
            a2.f = grbVar.n;
            goaVar = a2.a();
        } else {
            goaVar = grbVar.g;
        }
        ldd a3 = gurVar.a(goaVar);
        a3.getClass();
        if (!k3.b.y()) {
            k3.t();
        }
        lcc lccVar2 = (lcc) k3.b;
        lccVar2.g = a3;
        lccVar2.a |= 16;
        lcy b = grbVar.f.b();
        b.getClass();
        if (!k3.b.y()) {
            k3.t();
        }
        ljn ljnVar = k3.b;
        lcc lccVar3 = (lcc) ljnVar;
        lccVar3.f = b;
        lccVar3.a |= 8;
        long j = grbVar.m;
        if (!ljnVar.y()) {
            k3.t();
        }
        lcc lccVar4 = (lcc) k3.b;
        lccVar4.a |= 128;
        lccVar4.i = j;
        lcj lcjVar = grbVar.k;
        if (lcjVar != null) {
            ljh k4 = lch.c.k();
            k4.getClass();
            if (!k4.b.y()) {
                k4.t();
            }
            lch lchVar = (lch) k4.b;
            lchVar.b = lcjVar;
            lchVar.a |= 1;
            ljn q = k4.q();
            q.getClass();
            lch lchVar2 = (lch) q;
            if (!k3.b.y()) {
                k3.t();
            }
            lcc lccVar5 = (lcc) k3.b;
            lccVar5.h = lchVar2;
            lccVar5.a |= 32;
        }
        String str2 = grbVar.h;
        if (!TextUtils.isEmpty(str2)) {
            if (str2 != null) {
                kzv.a(str2, k3);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        String str3 = grbVar.i;
        if (!TextUtils.isEmpty(str3)) {
            if (str3 != null) {
                if (!k3.b.y()) {
                    k3.t();
                }
                lcc lccVar6 = (lcc) k3.b;
                lccVar6.a |= 4;
                lccVar6.e = str3;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        String str4 = grbVar.j;
        if (!TextUtils.isEmpty(str4)) {
            if (str4 != null) {
                kzv.a(str4, k3);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        ljn q2 = k3.q();
        q2.getClass();
        lcc lccVar7 = (lcc) q2;
        if (!k2.b.y()) {
            k2.t();
        }
        lcd lcdVar = (lcd) k2.b;
        lcdVar.d = lccVar7;
        lcdVar.a |= 1;
        int i = 3;
        if (grbVar.a != null) {
            ljh k5 = ldi.n.k();
            k5.getClass();
            lde ldeVar = grbVar.a;
            if (ldeVar != null) {
                if (!k5.b.y()) {
                    k5.t();
                }
                ldi ldiVar = (ldi) k5.b;
                ldiVar.b = ldeVar.W;
                ldiVar.a |= 1;
                ljn q3 = k5.q();
                q3.getClass();
                ldi ldiVar2 = (ldi) q3;
                if (!k2.b.y()) {
                    k2.t();
                }
                lcd lcdVar2 = (lcd) k2.b;
                lcdVar2.c = ldiVar2;
                lcdVar2.b = 2;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (grbVar.b != null) {
            ljh k6 = lcs.h.k();
            k6.getClass();
            lcr lcrVar = grbVar.b;
            if (lcrVar != null) {
                if (!k6.b.y()) {
                    k6.t();
                }
                ljn ljnVar2 = k6.b;
                lcs lcsVar = (lcs) ljnVar2;
                lcsVar.b = lcrVar.ai;
                lcsVar.a |= 1;
                int i2 = grbVar.r;
                if (i2 != 0) {
                    if (!ljnVar2.y()) {
                        k6.t();
                    }
                    lcs lcsVar2 = (lcs) k6.b;
                    lcsVar2.g = i2 - 1;
                    lcsVar2.a |= 256;
                }
                String str5 = grbVar.o;
                if (str5 != null) {
                    if (!k6.b.y()) {
                        k6.t();
                    }
                    lcs lcsVar3 = (lcs) k6.b;
                    lcsVar3.a |= 32;
                    lcsVar3.f = str5;
                }
                ljn q4 = k6.q();
                q4.getClass();
                lcs lcsVar4 = (lcs) q4;
                if (!k2.b.y()) {
                    k2.t();
                }
                lcd lcdVar3 = (lcd) k2.b;
                lcdVar3.c = lcsVar4;
                lcdVar3.b = 3;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (grbVar.q != 0) {
            ljh k7 = ldb.c.k();
            k7.getClass();
            int i3 = grbVar.q;
            if (i3 != 0) {
                if (!k7.b.y()) {
                    k7.t();
                }
                ldb ldbVar = (ldb) k7.b;
                ldbVar.b = i3 - 1;
                ldbVar.a |= 1;
                ljn q5 = k7.q();
                q5.getClass();
                ldb ldbVar2 = (ldb) q5;
                if (!k2.b.y()) {
                    k2.t();
                }
                lcd lcdVar4 = (lcd) k2.b;
                lcdVar4.c = ldbVar2;
                lcdVar4.b = 4;
            } else {
                throw null;
            }
        } else {
            throw new IllegalStateException("GnpLogEvent must have interactionType, failureType, or systemEventType.");
        }
        ljn q6 = k2.q();
        q6.getClass();
        lcd lcdVar5 = (lcd) q6;
        if (!k.b.y()) {
            k.t();
        }
        lce lceVar = (lce) k.b;
        lceVar.b = lcdVar5;
        lceVar.a |= 2;
        int ordinal = grbVar.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                i = 2;
                            } else {
                                throw new mku();
                            }
                        } else {
                            i = 15;
                        }
                    } else {
                        i = 13;
                    }
                } else {
                    i = 14;
                }
            }
        } else {
            i = 4;
        }
        if (!k.b.y()) {
            k.t();
        }
        lce lceVar2 = (lce) k.b;
        lceVar2.c = i - 1;
        lceVar2.a |= 4;
        ljn q7 = k.q();
        q7.getClass();
        lce lceVar3 = (lce) q7;
        String str6 = grbVar.p;
        if (str6 == null) {
            p = this.c.q();
        } else {
            p = this.c.p(str6);
        }
        p.h(lceVar3, fzz.b(this.b, new lca())).c();
        a.k().u("GNP ClearCut log [%s]", lceVar3);
    }
}
