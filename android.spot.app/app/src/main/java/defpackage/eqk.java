package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.adm.R;
import j$.util.Map;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostHandlerImpl");
    public final ewg b;
    public final ele c;
    public final dwu d;
    public final Context e;
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    public final dxf h;
    private final evy i;
    private final Executor j;
    private final jzd k;
    private final hnu l;
    private final ddg m;
    private final dhx n;

    public eqk(ddg ddgVar, hnu hnuVar, evy evyVar, ewg ewgVar, ele eleVar, dhx dhxVar, dxf dxfVar, dwu dwuVar, Context context, Executor executor, jzd jzdVar) {
        this.m = ddgVar;
        this.l = hnuVar;
        this.i = evyVar;
        this.b = ewgVar;
        this.c = eleVar;
        this.n = dhxVar;
        this.h = dxfVar;
        this.d = dwuVar;
        this.e = context;
        this.j = executor;
        this.k = jzdVar;
    }

    private final jyz f(lqd lqdVar, kuv kuvVar) {
        boolean z;
        if (lqdVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        jer a2 = a(lqdVar);
        if (!a2.g()) {
            return iuu.r(new IllegalArgumentException("Device not attached"));
        }
        return jbx.d(this.m.C().A(this.l.m(kuvVar))).e(new emc(this, a2, 6, null), this.j);
    }

    public final jer a(lqd lqdVar) {
        return eyf.b(this.b.c(), lqdVar);
    }

    public final jyz b(lqd lqdVar, jer jerVar, jer jerVar2, jer jerVar3) {
        boolean z;
        hwx.U(a(lqdVar).g());
        if (lqdVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        lpz a2 = this.c.a((lqc) a(lqdVar).c());
        kyf kyfVar = a2.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        kxz kxzVar = kylVar.h;
        if (kxzVar == null) {
            kxzVar = kxz.d;
        }
        int i = 5;
        ljh ljhVar = (ljh) kxzVar.z(5);
        ljhVar.w(kxzVar);
        if (jerVar.g()) {
            String c = c();
            if (!((Boolean) jerVar.c()).booleanValue() || c == null) {
                c = "";
            }
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            ((kxz) ljhVar.b).c = c;
        }
        if (jerVar3.g()) {
            Object c2 = jerVar3.c();
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            ((kxz) ljhVar.b).b = (String) c2;
        }
        if (jerVar2.g()) {
            Object c3 = jerVar2.c();
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            ((kxz) ljhVar.b).a = (String) c3;
        }
        kxz kxzVar2 = (kxz) ljhVar.q();
        cfn cfnVar = (cfn) Map.EL.computeIfAbsent(this.g, lqdVar, new eff(14));
        cfnVar.l(new eqg(jer.i(kxzVar2)));
        this.h.c(lnb.UPDATE_CONTACT_INFO_REQUESTED, jdl.a, lqdVar);
        kyf kyfVar2 = a2.b;
        if (kyfVar2 == null) {
            kyfVar2 = kyf.r;
        }
        kxv kxvVar = kyfVar2.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        ksr ksrVar = new ksr(kxvVar);
        ksrVar.d();
        Object obj = ksrVar.b;
        ljh k = kyl.j.k();
        if (!k.b.y()) {
            k.t();
        }
        kyl kylVar2 = (kyl) k.b;
        kxzVar2.getClass();
        kylVar2.h = kxzVar2;
        kylVar2.a |= 1;
        ljh ljhVar2 = (ljh) obj;
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        kyf kyfVar3 = (kyf) ljhVar2.b;
        kyl kylVar3 = (kyl) k.q();
        kylVar3.getClass();
        kyfVar3.c = kylVar3;
        kyfVar3.a |= 2;
        ((ljh) ksrVar.a).J("description.contact_info");
        ksrVar.c = "description.contact_info";
        jbx e = jbx.d(f(lqdVar, ksrVar.G())).e(new eoc(this, 6), this.j);
        byte[] bArr = null;
        return e.e(new emc(this, lqdVar, 4, bArr), this.k).a(Throwable.class, new emc(this, lqdVar, i, bArr), this.j).e(new eoc(cfnVar, 7), this.j);
    }

    public final String c() {
        Account b = this.i.b();
        if (b == null) {
            return null;
        }
        return b.name;
    }

    public final void d(int i) {
        this.n.m(i);
    }

    public final jyz e(final lqd lqdVar, final int i, final boolean z) {
        boolean z2;
        eqh eqhVar;
        lnb lnbVar;
        int i2 = 1;
        if (lqdVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.U(z2);
        cfn cfnVar = (cfn) Map.EL.computeIfAbsent(this.f, lqdVar, new eff(17));
        if (i == 3) {
            eqhVar = eqh.MARKING_AS_LOST;
        } else {
            eqhVar = eqh.MARKING_AS_FOUND;
        }
        cfnVar.l(jer.i(eqhVar));
        dxf dxfVar = this.h;
        if (i == 3) {
            lnbVar = lnb.MARK_LOST_REQUESTED;
        } else {
            lnbVar = lnb.MARK_FOUND_REQUESTED;
        }
        dxfVar.c(lnbVar, jdl.a, lqdVar);
        kyf kyfVar = this.c.a((lqc) a(lqdVar).c()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        ksr ksrVar = new ksr(kxvVar);
        Object obj = ksrVar.b;
        ljh k = kzc.c.k();
        if (!k.b.y()) {
            k.t();
        }
        ((kzc) k.b).a = a.B(i);
        ljh ljhVar = (ljh) obj;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        kyf kyfVar2 = (kyf) ljhVar.b;
        kzc kzcVar = (kzc) k.q();
        kzcVar.getClass();
        kyfVar2.d = kzcVar;
        kyfVar2.a |= 4;
        ((ljh) ksrVar.a).J("lost_info.lost_state");
        jbx e = jbx.d(f(lqdVar, ksrVar.G())).e(new jei() { // from class: eqj
            @Override // defpackage.jei
            public final Object a(Object obj2) {
                lnb lnbVar2;
                if (i == 3) {
                    lnbVar2 = lnb.MARK_LOST;
                } else {
                    lnbVar2 = lnb.MARK_FOUND;
                }
                eqk eqkVar = eqk.this;
                eqkVar.h.c(lnbVar2, jdl.a, lqdVar);
                return null;
            }
        }, this.k).b(Throwable.class, new gfm(this, i, lqdVar, i2), jxv.a).e(new jei() { // from class: eqi
            @Override // defpackage.jei
            public final Object a(Object obj2) {
                eqk eqkVar;
                String c;
                lqu lquVar;
                lqu lquVar2;
                Object n;
                if (z && i == 2 && (c = (eqkVar = eqk.this).c()) != null) {
                    lqd lqdVar2 = lqdVar;
                    dwu dwuVar = eqkVar.d;
                    if (lqdVar2.a == 3) {
                        lquVar = (lqu) lqdVar2.b;
                    } else {
                        lquVar = lqu.c;
                    }
                    kxv kxvVar2 = lquVar.b;
                    if (kxvVar2 == null) {
                        kxvVar2 = kxv.b;
                    }
                    String str = kxvVar2.a;
                    int i3 = jse.a;
                    jsb jsbVar = jsd.a;
                    Charset charset = StandardCharsets.UTF_8;
                    jsc d = ((jrq) jsbVar).d();
                    byte[] bytes = str.toString().getBytes(charset);
                    bytes.getClass();
                    ((jrp) d).a(bytes, 0, bytes.length);
                    String format = String.format("lost_item_found:%s", d.k());
                    Context context = eqkVar.e;
                    Context context2 = eqkVar.e;
                    String string = context.getString(R.string.device_found_notification_title);
                    String string2 = context2.getString(R.string.device_found_notification_body, ((lqc) eqkVar.a(lqdVar2).c()).g);
                    if (lqdVar2.a == 3) {
                        lquVar2 = (lqu) lqdVar2.b;
                    } else {
                        lquVar2 = lqu.c;
                    }
                    kxv kxvVar3 = lquVar2.b;
                    if (kxvVar3 == null) {
                        kxvVar3 = kxv.b;
                    }
                    String format2 = String.format("android://find/account/%s/device/2/%s", c, kxvVar3.a);
                    try {
                        gga ggaVar = dwuVar.b;
                        gwh gwhVar = new gwh(c);
                        ljh k2 = lga.x.k();
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        ljn ljnVar = k2.b;
                        lga lgaVar = (lga) ljnVar;
                        string.getClass();
                        lgaVar.a |= 1;
                        lgaVar.b = string;
                        if (!ljnVar.y()) {
                            k2.t();
                        }
                        lga lgaVar2 = (lga) k2.b;
                        string2.getClass();
                        lgaVar2.a |= 2;
                        lgaVar2.c = string2;
                        ljh k3 = lgh.d.k();
                        if (!k3.b.y()) {
                            k3.t();
                        }
                        lgh lghVar = (lgh) k3.b;
                        lghVar.a |= 1;
                        lghVar.b = "https://www.gstatic.com/images/branding/product/2x/find_my_device_96dp.png";
                        lgh lghVar2 = (lgh) k3.q();
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        lga lgaVar3 = (lga) k2.b;
                        lghVar2.getClass();
                        ljv ljvVar = lgaVar3.d;
                        if (!ljvVar.c()) {
                            lgaVar3.d = ljn.p(ljvVar);
                        }
                        lgaVar3.d.add(lghVar2);
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        lga lgaVar4 = (lga) k2.b;
                        format2.getClass();
                        lgaVar4.a |= 16;
                        lgaVar4.g = format2;
                        ljh k4 = lft.c.k();
                        if (!k4.b.y()) {
                            k4.t();
                        }
                        lft lftVar = (lft) k4.b;
                        lftVar.a |= 1;
                        lftVar.b = "spot-findmydevice-lostdevice";
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        lga lgaVar5 = (lga) k2.b;
                        lft lftVar2 = (lft) k4.q();
                        lftVar2.getClass();
                        lgaVar5.n = lftVar2;
                        lgaVar5.a |= 2048;
                        ljh k5 = lfx.i.k();
                        if (!k5.b.y()) {
                            k5.t();
                        }
                        ljn ljnVar2 = k5.b;
                        lfx lfxVar = (lfx) ljnVar2;
                        string.getClass();
                        lfxVar.a = 1 | lfxVar.a;
                        lfxVar.b = string;
                        if (!ljnVar2.y()) {
                            k5.t();
                        }
                        lfx lfxVar2 = (lfx) k5.b;
                        string2.getClass();
                        lfxVar2.a = 2 | lfxVar2.a;
                        lfxVar2.c = string2;
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        lga lgaVar6 = (lga) k2.b;
                        lfx lfxVar3 = (lfx) k5.q();
                        lfxVar3.getClass();
                        lgaVar6.h = lfxVar3;
                        lgaVar6.a |= 32;
                        lga lgaVar7 = (lga) k2.q();
                        gnd c2 = gnd.c();
                        format.getClass();
                        lgaVar7.getClass();
                        n = mpp.n(mnc.a, new gsc(ggaVar, gwhVar, format, lgaVar7, c2, (mmx) null, 1));
                        return null;
                    } catch (gfy e2) {
                        ((jni) ((jni) ((jni) dwu.a.g()).i(e2)).j("com/google/android/apps/adm/chime/SpotLocalNotificationsHelper", "createLocalNotification", 84, "SpotLocalNotificationsHelper.java")).u("Error sending a local notification. notificationId: %s", format);
                        return null;
                    }
                }
                return null;
            }
        }, this.k);
        e.c(new dzw(cfnVar, 16), this.j);
        return e;
    }
}
