package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fhq implements fhu {
    public final Context b;
    public final String c;
    public final fhl d;
    public final fik e;
    public final Looper f;
    public final int g;
    public final fht h;
    protected final fje i;
    public final gok j;
    public final bym k;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:            if (r11 == null) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:            if (r12 != false) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:            if (r11 == null) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:            if (r12 != false) goto L107;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fhq(android.content.Context r8, android.app.Activity r9, defpackage.gok r10, defpackage.fhl r11, defpackage.fhp r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhq.<init>(android.content.Context, android.app.Activity, gok, fhl, fhp):void");
    }

    private final fxs a(int i, fjz fjzVar) {
        bym bymVar = new bym((int[]) null);
        int i2 = fjzVar.d;
        fje fjeVar = this.i;
        fjeVar.i(bymVar, i2, this);
        fih fihVar = new fih(i, fjzVar, bymVar);
        Handler handler = fjeVar.n;
        handler.sendMessage(handler.obtainMessage(4, new hxh(fihVar, fjeVar.j.get(), this)));
        return (fxs) bymVar.a;
    }

    public static Bitmap k(View view) {
        Bitmap createBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
                beginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
                view.draw(beginRecording);
                picture.endRecording();
                createBitmap = Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                return createBitmap;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap2));
            return createBitmap2;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    @Override // defpackage.fhu
    public final fik c() {
        return this.e;
    }

    public final fjo d(Object obj, String str) {
        return fma.aY(obj, this.f, str);
    }

    public final fko e() {
        Set emptySet;
        GoogleSignInAccount a;
        fko fkoVar = new fko();
        fhl fhlVar = this.d;
        Account account = null;
        if ((fhlVar instanceof fhj) && (a = ((fhj) fhlVar).a()) != null) {
            String str = a.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else {
            fhl fhlVar2 = this.d;
            if (fhlVar2 instanceof fhi) {
                account = ((fhi) fhlVar2).a();
            }
        }
        fkoVar.a = account;
        fhl fhlVar3 = this.d;
        if (fhlVar3 instanceof fhj) {
            GoogleSignInAccount a2 = ((fhj) fhlVar3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (fkoVar.b == null) {
            fkoVar.b = new rz();
        }
        fkoVar.b.addAll(emptySet);
        fkoVar.d = this.b.getClass().getName();
        fkoVar.c = this.b.getPackageName();
        return fkoVar;
    }

    public final fxs f(fjz fjzVar) {
        return a(0, fjzVar);
    }

    public final fxs g(fjm fjmVar, int i) {
        bym bymVar = new bym((int[]) null);
        fje fjeVar = this.i;
        fjeVar.i(bymVar, i, this);
        fii fiiVar = new fii(fjmVar, bymVar);
        Handler handler = fjeVar.n;
        handler.sendMessage(handler.obtainMessage(13, new hxh(fiiVar, fjeVar.j.get(), this)));
        return (fxs) bymVar.a;
    }

    public final fxs h(fjz fjzVar) {
        return a(1, fjzVar);
    }

    public final void i(int i, fio fioVar) {
        boolean z = true;
        if (!fioVar.f && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        fioVar.f = z;
        fje fjeVar = this.i;
        fjeVar.n.sendMessage(fjeVar.n.obtainMessage(4, new hxh(new fif(i, fioVar), fjeVar.j.get(), this)));
    }

    public final fxs l(LocationSettingsRequest locationSettingsRequest) {
        fjy fjyVar = new fjy();
        fjyVar.a = new fep(locationSettingsRequest, 20);
        fjyVar.c = 2426;
        return f(fjyVar.a());
    }

    public final fxs m() {
        fjy fjyVar = new fjy();
        fjyVar.a = new fun(9);
        fjyVar.c = 4501;
        return f(fjyVar.a());
    }

    public final void n(fyg fygVar) {
        fjo aY = fma.aY(fygVar, this.f, fyg.class.getSimpleName());
        fuo fuoVar = new fuo(this, aY, ((fye) this.d).b, 2);
        fsw fswVar = new fsw(this, 11);
        fjt fjtVar = new fjt();
        fjtVar.a = fuoVar;
        fjtVar.b = fswVar;
        fjtVar.c = aY;
        fjtVar.d = new Feature[]{fxy.a};
        fjtVar.f = 4507;
        p(fjtVar.a());
    }

    public final void o(fjz fjzVar) {
        a(2, fjzVar);
    }

    public final fxs p(apc apcVar) {
        fma.aS(((fjs) apcVar.c).a(), "Listener has already been released.");
        bym bymVar = new bym((int[]) null);
        Object obj = apcVar.c;
        int i = ((fjs) obj).d;
        fje fjeVar = this.i;
        fjeVar.i(bymVar, i, this);
        fig figVar = new fig(new apc(obj, apcVar.b, apcVar.a, (byte[]) null), bymVar);
        Handler handler = fjeVar.n;
        handler.sendMessage(handler.obtainMessage(8, new hxh(figVar, fjeVar.j.get(), this)));
        return (fxs) bymVar.a;
    }

    protected void j() {
    }

    public fhq(Context context, gok gokVar, fhl fhlVar, fhp fhpVar) {
        this(context, null, gokVar, fhlVar, fhpVar);
    }

    public fhq(Context context) {
        this(context, fnn.a, fhl.a, fhp.a);
        fyw.a(context.getApplicationContext());
    }
}
