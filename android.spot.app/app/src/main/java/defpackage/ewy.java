package defpackage;

import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewy implements jei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r0v31, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [moh, java.lang.Object] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        CharSequence profileSwitchingLabel;
        Drawable profileSwitchingIconDrawable;
        boolean z = false;
        boolean z2 = false;
        z = false;
        final int i = 1;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(this.a.b((lqc) obj));
            case 1:
                kyf kyfVar = ((exa) this.a).a.a((lqc) obj).b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kzc kzcVar = kyfVar.d;
                if (kzcVar == null) {
                    kzcVar = kzc.c;
                }
                return Boolean.valueOf(eku.k(kzcVar));
            case 2:
                exa exaVar = (exa) this.a;
                if (eku.j((lqc) obj, exaVar.a) && exaVar.d()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                UserHandle userHandle = (UserHandle) obj;
                Object obj2 = this.a;
                obj2.getClass();
                profileSwitchingLabel = he$$ExternalSyntheticApiModelOutline0.m(obj2).getProfileSwitchingLabel(userHandle);
                profileSwitchingIconDrawable = he$$ExternalSyntheticApiModelOutline0.m(obj2).getProfileSwitchingIconDrawable(userHandle);
                return new ezk(profileSwitchingLabel, profileSwitchingIconDrawable);
            case 4:
                return ((fhq) this.a).g(fma.aX(fqb.a, "accountHealthListener"), 28002);
            case 5:
                final fpu fpuVar = (fpu) obj;
                Object obj3 = this.a;
                fhq fhqVar = (fhq) obj3;
                fjo d = fhqVar.d(fqb.a, "accountHealthListener");
                fpx fpxVar = new fpx(obj3, new fen(d, 3), z ? 1 : 0);
                fep fepVar = new fep(obj3, 17);
                fjt fjtVar = new fjt();
                fjtVar.c = d;
                fjtVar.d = new Feature[]{fpk.a};
                fjtVar.a = fpxVar;
                fjtVar.b = fepVar;
                fjtVar.f = 28001;
                fxs p = fhqVar.p(fjtVar.a());
                p.q(new fqd(fpuVar, 1));
                p.p(new fxl() { // from class: fqe
                    @Override // defpackage.fxl
                    public final void a() {
                        if (i != 0) {
                            fqb.b.c(fpuVar, new ene(18));
                        } else {
                            fqj.b.c(fpuVar, new gfa(1));
                        }
                    }
                });
                return p;
            case 6:
                final fpv fpvVar = (fpv) obj;
                Object obj4 = this.a;
                fhq fhqVar2 = (fhq) obj4;
                fjo d2 = fhqVar2.d(fqj.a, "accountMessagesListener");
                fpx fpxVar2 = new fpx(obj4, new fen(d2, 4, (byte[]) null), 2);
                fep fepVar2 = new fep(obj4, 19);
                fjt fjtVar2 = new fjt();
                fjtVar2.c = d2;
                fjtVar2.d = new Feature[]{fpk.b};
                fjtVar2.a = fpxVar2;
                fjtVar2.b = fepVar2;
                fjtVar2.f = 28007;
                fxs p2 = fhqVar2.p(fjtVar2.a());
                p2.q(new fqd(fpvVar, 0));
                final int i2 = z ? 1 : 0;
                p2.p(new fxl() { // from class: fqe
                    @Override // defpackage.fxl
                    public final void a() {
                        if (i2 != 0) {
                            fqb.b.c(fpvVar, new ene(18));
                        } else {
                            fqj.b.c(fpvVar, new gfa(1));
                        }
                    }
                });
                return p2;
            case 7:
                return ((fhq) this.a).g(fma.aX(fqj.a, "accountMessagesListener"), 28008);
            case 8:
                gfs gfsVar = (gfs) obj;
                if (gfn.i(gfsVar)) {
                    kxq kxqVar = gfsVar.a;
                    if (kxqVar == null) {
                        kxqVar = kxq.b;
                    }
                    return jer.i(kxqVar);
                }
                return ((gfn) this.a).a();
            case 9:
                jer jerVar = (jer) obj;
                ((gfn) this.a).f.G(1007, jerVar.g());
                return jerVar;
            case 10:
                jer jerVar2 = (jer) obj;
                ((gfn) this.a).f.G(1006, jerVar2.g());
                return jerVar2;
            case 11:
                kxq kxqVar2 = (kxq) obj;
                ((gfn) this.a).f.D(true);
                return kxqVar2;
            case 12:
                InputStream inputStream = (InputStream) obj;
                ((gfn) this.a).f.E(true);
                return inputStream;
            case 13:
                return this.a.a(obj);
            case 14:
                return this.a.a(obj);
            case 15:
                gpn gpnVar = new gpn();
                gpnVar.b((lfs) obj);
                gpnVar.c((gpq) this.a);
                return gpnVar.a();
            case 16:
                return this.a.a(obj);
            case 17:
                hbm hbmVar = (hbm) this.a;
                hbmVar.d = (String) obj;
                hbmVar.e = true;
                hbmVar.aT();
                return null;
            case 18:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((hpk) this.a).b = true;
                    return null;
                }
            case 19:
                fyj fyjVar = (fyj) ((lrs) obj).a;
                fma.aR(fyjVar.a);
                int i3 = fyjVar.a.a;
                if (i3 == 1 || i3 == 3) {
                    z2 = true;
                }
                Object obj5 = this.a;
                Boolean valueOf = Boolean.valueOf(z2);
                ((huj) obj5).a.set(valueOf);
                return valueOf;
            default:
                return new huv(((huy) this.a).b.a, (lhg) obj);
        }
    }
}
