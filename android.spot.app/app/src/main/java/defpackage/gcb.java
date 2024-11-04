package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gcb implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, gfi] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, gfi] */
    /* JADX WARN: Type inference failed for: r1v17, types: [gzt, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String sb;
        jyz d;
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((gcc) obj).h = null;
                jax c = jbu.c("GIL:AutoProcessLogBatch");
                try {
                    gbd gbdVar = ((gcc) obj).a;
                    gcf gcfVar = ((gcc) obj).b;
                    gcfVar.getClass();
                    gbdVar.b(new gca(gcfVar, i));
                    c.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                ((gcc) this.a).a();
                return;
            case 2:
                Object obj2 = this.a;
                gcc gccVar = (gcc) obj2;
                gccVar.f = null;
                if (!gccVar.b.c()) {
                    return;
                }
                jax c2 = jbu.c("GIL:AutoProcessBatch");
                try {
                    ((gcc) obj2).a.b(new gca(obj2, i2));
                    c2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        c2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 3:
                ((gcc) this.a).a();
                return;
            case 4:
                this.a.b();
                return;
            case 5:
                this.a.a();
                return;
            case 6:
                ((gnr) this.a).a.cancel(false);
                return;
            case 7:
                ((gpw) this.a).a();
                return;
            case 8:
                r0.c--;
                ((GnpExecutorApiService) this.a).a();
                return;
            case 9:
                ((AccountParticleDisc) this.a).p();
                return;
            case 10:
                AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.a;
                gzy gzyVar = accountParticleDisc.e;
                if (gzyVar != null) {
                    gzyVar.a(AccountParticleDisc.b(accountParticleDisc.l), true);
                    return;
                }
                return;
            case 11:
                AccountParticleDisc accountParticleDisc2 = (AccountParticleDisc) this.a;
                final haa haaVar = new haa(accountParticleDisc2.getResources());
                gzt gztVar = new gzt() { // from class: gzz
                    @Override // defpackage.gzt
                    public final gzr a(Object obj3) {
                        gzo gzoVar = null;
                        if (frx.an(obj3).a) {
                            if (haa.a == null) {
                                haa.a = new hae(new frx(), null, haa.this.b.getString(R.string.og_google_one_account_a11y), 0);
                            }
                            gzoVar = new gzo(jdl.a, jer.i(haa.a));
                        }
                        return new gzr(gzoVar);
                    }
                };
                ijs.c();
                hha hhaVar = accountParticleDisc2.n;
                hhaVar.c(hhaVar.b, hhaVar.c);
                hhaVar.b = gztVar;
                hhaVar.b(gztVar, hhaVar.c);
                return;
            case 12:
                Object obj3 = this.a;
                final nhc nhcVar = (nhc) obj3;
                Object obj4 = nhcVar.b;
                Map map = gzm.a;
                ImageView imageView = (ImageView) ((WeakReference) obj4).get();
                if (!nhcVar.a && imageView != null) {
                    if (nhcVar.d == null) {
                        try {
                            ((nhc) obj3).g(imageView.getContext());
                            return;
                        } catch (IllegalStateException unused) {
                            hog.H(new gno(obj3, imageView, 6, null));
                            return;
                        }
                    }
                    Integer num = (Integer) hog.F(imageView).e(0);
                    final int intValue = num.intValue();
                    Object obj5 = nhcVar.d;
                    Locale locale = Locale.ROOT;
                    if (obj5 == null) {
                        sb = "null";
                    } else {
                        StringBuilder sb2 = new StringBuilder(frx.aj(obj5));
                        str = ((hfl) obj5).g;
                        if (str != null) {
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        sb = sb2.toString();
                    }
                    final String format = String.format(locale, "%s %s", sb, num);
                    Drawable drawable = (Drawable) gzm.a.get(format);
                    if (drawable != null) {
                        nhcVar.j(drawable, true);
                        return;
                    }
                    Object obj6 = nhcVar.e;
                    final Drawable drawable2 = (Drawable) gzm.b.get(format);
                    if (drawable2 != null) {
                        nhcVar.j(drawable2, false);
                    }
                    hiq hiqVar = (hiq) obj6;
                    final his hisVar = hiqVar.b;
                    his hisVar2 = hiqVar.a;
                    Object obj7 = nhcVar.d;
                    hir hirVar = new hir() { // from class: gzk
                        @Override // defpackage.hir
                        public final void a(Bitmap bitmap) {
                            nhc nhcVar2 = nhc.this;
                            if (nhcVar2.a) {
                                return;
                            }
                            String str2 = format;
                            if (bitmap != null) {
                                nhcVar2.i(new ci((Object) nhcVar2, (Object) bitmap, (Object) str2, 17, (byte[]) null));
                                return;
                            }
                            Drawable drawable3 = drawable2;
                            if (drawable3 != null) {
                                nhcVar2.j(drawable3, true);
                            } else if (hnu.c(hit.a(nhcVar2.d))) {
                                nhcVar2.i(new gzi(nhcVar2, hisVar, intValue, str2, 0));
                            } else {
                                hog.H(new gcb(nhcVar2, 13));
                            }
                        }
                    };
                    hfl hflVar = (hfl) obj7;
                    hfr hfrVar = (hfr) hisVar2;
                    Context context = hfrVar.a;
                    int i3 = 64;
                    if (intValue > 0) {
                        float f = intValue / context.getResources().getDisplayMetrics().density;
                        int[] iArr = {32, 48, 64, 120, 240};
                        while (true) {
                            if (i2 < 5) {
                                i3 = iArr[i2];
                                if (i3 != 0) {
                                    if (f > i3) {
                                        i2++;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                i3 = 240;
                            }
                        }
                    }
                    if (hfrVar.c) {
                        d = hfrVar.b.c(hflVar.c, i3);
                    } else {
                        d = hfrVar.b.d(hflVar.c, i3);
                    }
                    ivc.N(d, new dup(hirVar, 9), jxv.a);
                    return;
                }
                return;
            case 13:
                ((nhc) this.a).h();
                return;
            case 14:
                ((View) this.a).requestLayout();
                return;
            case 15:
                hbq hbqVar = (hbq) this.a;
                hbqVar.b.setContentDescription(null);
                int[] iArr2 = bwn.a;
                hbqVar.b.setImportantForAccessibility(4);
                return;
            case 16:
                hbq hbqVar2 = (hbq) this.a;
                SelectedAccountDisc selectedAccountDisc = hbqVar2.b;
                selectedAccountDisc.b.setVisibility(0);
                selectedAccountDisc.a.setVisibility(8);
                AccountParticleDisc accountParticleDisc3 = selectedAccountDisc.b;
                accountParticleDisc3.getClass();
                selectedAccountDisc.post(new gcb(accountParticleDisc3, 14));
                hbqVar2.b();
                return;
            case 17:
                ((hcj) this.a).a.a.setEnabled(true);
                return;
            case 18:
                hcc hccVar = (hcc) ((ktn) this.a).b;
                Object a = hccVar.b.a();
                ljh k = lnh.g.k();
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                lnh lnhVar = (lnh) ljnVar;
                lnhVar.c = 8;
                lnhVar.a = 2 | lnhVar.a;
                if (!ljnVar.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                lnh lnhVar2 = (lnh) ljnVar2;
                lnhVar2.e = 8;
                lnhVar2.a |= 32;
                if (!ljnVar2.y()) {
                    k.t();
                }
                ljn ljnVar3 = k.b;
                lnh lnhVar3 = (lnh) ljnVar3;
                lnhVar3.d = 3;
                lnhVar3.a = 8 | lnhVar3.a;
                if (!ljnVar3.y()) {
                    k.t();
                }
                hiw hiwVar = hccVar.f;
                lnh lnhVar4 = (lnh) k.b;
                lnhVar4.b = 32;
                lnhVar4.a |= 1;
                hiwVar.a(a, (lnh) k.q());
                return;
            case 19:
                ((hcu) this.a).g.b().run();
                return;
            default:
                ((hcu) this.a).g.a().run();
                return;
        }
    }
}
