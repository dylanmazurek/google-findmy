package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nca {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public nca(Context context, cuj cujVar, cud cudVar, cuj cujVar2, cuj cujVar3) {
        this.c = context;
        this.a = cujVar;
        this.e = cudVar;
        this.d = cujVar2;
        this.b = cujVar3;
    }

    public static nca h(SecretKey secretKey) {
        int length = secretKey.getEncoded().length;
        if (length != 16 && length != 24 && length != 32) {
            throw new InvalidKeyException("Unsupported key size.");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKey);
            Cipher cipher2 = Cipher.getInstance("AES/CTR/NoPadding");
            try {
                byte[] o = o(cipher.doFinal(new byte[16]));
                return new nca(secretKey, cipher, cipher2, o, o(o));
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchPaddingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean l(Context context) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.intent.action.BUG_REPORT"), 0);
        ResolveInfo resolveInfo = null;
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.serviceInfo != null && next.serviceInfo.packageName.startsWith("com.google")) {
                    resolveInfo = next;
                    break;
                }
            }
        }
        if (resolveInfo == null) {
            return false;
        }
        return true;
    }

    private static byte[] o(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        int i3 = bArr[0] & 128;
        while (i2 < 15) {
            byte b = bArr[i2];
            int i4 = i2 + 1;
            bArr2[i2] = (byte) (((b + b) & 255) | ((bArr[i4] & 255) >>> 7));
            i2 = i4;
        }
        if (i3 != 0) {
            i = 101;
        } else {
            i = -30;
        }
        int i5 = bArr[15] ^ 113;
        bArr2[15] = (byte) (((i5 + i5) ^ i) & 255);
        return bArr2;
    }

    private static String p(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String q(String str) {
        if (str != null) {
            return ivc.m(str.trim());
        }
        return null;
    }

    private static final ThemeSettings r() {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        return themeSettings;
    }

    public final int a() {
        return ((mrp) this.c).b - ((mrp) this.d).b;
    }

    public final nbv b(nbv nbvVar) {
        if (a() == 127) {
            return nbvVar;
        }
        if (nbvVar.h.a == 1) {
            ((mrp) this.e).b();
        }
        int i = ((mrp) this.c).b & 127;
        while (((AtomicReferenceArray) this.a).get(i) != null) {
            Thread.yield();
        }
        ((AtomicReferenceArray) this.a).lazySet(i, nbvVar);
        ((mrp) this.c).b();
        return null;
    }

    public final nbv c() {
        nbv nbvVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            int i = ((mrp) obj).b;
            if (i - ((mrp) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((mrp) this.d).c(i, i + 1) && (nbvVar = (nbv) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (nbvVar.h.a == 1) {
                    ((mrp) this.e).a();
                    boolean z = msy.a;
                }
                return nbvVar;
            }
        }
    }

    public final nbv d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = i & 127;
        nbv nbvVar = (nbv) ((AtomicReferenceArray) this.a).get(i2);
        if (nbvVar != null && nbvVar.h.a == z) {
            Object obj = this.a;
            do {
                atomicReferenceArray = (AtomicReferenceArray) obj;
                if (atomicReferenceArray.compareAndSet(i2, nbvVar, null)) {
                    if (z) {
                        ((mrp) this.e).a();
                    }
                    return nbvVar;
                }
            } while (atomicReferenceArray.get(i2) == nbvVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.security.Key, java.lang.Object] */
    public final byte[] e(byte[] bArr, byte[] bArr2) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        try {
            ((Cipher) this.e).init(1, (Key) this.c, ivParameterSpec);
            try {
                return ((Cipher) this.e).doFinal(bArr2);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] f(int i, byte[] bArr) {
        int i2;
        Object obj;
        int length = bArr.length;
        int i3 = length & 15;
        if (i3 == 0) {
            i2 = length + 16;
        } else {
            i2 = (((length >> 4) + 1) * 16) + 16;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 16, length);
        if (i3 == 0) {
            obj = this.d;
        } else {
            Object obj2 = this.b;
            bArr2[length + 16] = Byte.MIN_VALUE;
            obj = obj2;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = (i2 - 16) + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ ((byte[]) obj)[i4]);
        }
        byte[] bArr3 = new byte[16];
        for (int i6 = 0; i6 < (i2 >> 4); i6++) {
            for (int i7 = 0; i7 < 16; i7++) {
                bArr3[i7] = (byte) (bArr3[i7] ^ bArr2[(i6 * 16) + i7]);
            }
            try {
                bArr3 = ((Cipher) this.a).doFinal(bArr3);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        }
        return bArr3;
    }

    public final jbx g(ico icoVar, byte[] bArr, kyf kyfVar) {
        gfl gflVar = new gfl(this, bArr, icoVar, 7);
        return jbx.d(((kuv) this.c).w(kyfVar, kyh.DEVICE_COMPONENT_UNSPECIFIED, gflVar));
    }

    public final void i(Object obj, hak hakVar) {
        String q = q(frx.am(obj));
        String q2 = q(frx.ak(obj));
        frx frxVar = ((ham) this.e).b;
        String str = null;
        if (true == frx.az(obj).a) {
            q2 = null;
        }
        if (q == null) {
            q = q2;
        }
        if (true != amr.i(q, q2)) {
            str = q2;
        }
        q.getClass();
        Object obj2 = this.b;
        String p = p(q);
        ((TextView) obj2).setText(p);
        if (str != null) {
            Object obj3 = this.c;
            String p2 = p(str);
            int[] iArr = bwn.a;
            ((View) obj3).setImportantForAccessibility(2);
            p = a.an(p2, p, "\n");
            ((TextView) this.c).setText(p2);
            ((TextView) this.c).setVisibility(0);
        } else {
            ((TextView) this.c).setVisibility(8);
        }
        if (this.a != null) {
            ((TextView) this.c).getVisibility();
            jer jerVar = ((ham) this.e).a;
            if (jerVar.g()) {
                jerVar.c();
            }
            ((TextView) this.a).setVisibility(8);
        }
        String a = hakVar.a(p);
        ((AccountParticleDisc) this.d).j(obj);
        String d = ((AccountParticleDisc) this.d).d();
        if (d != null) {
            a = a.an(d, a, "\n");
        }
        ((TextView) this.b).setContentDescription(a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [mko, java.lang.Object] */
    public final gyt j(gyp gypVar, String str, int i) {
        Context b = ((lry) this.e).b();
        mnb b2 = ((dvu) this.a).b();
        mnb b3 = ((dvu) this.b).b();
        ghf ghfVar = (ghf) this.c.a();
        ghfVar.getClass();
        gwc gwcVar = new gwc();
        gvg gvgVar = (gvg) this.d.a();
        gvgVar.getClass();
        gypVar.getClass();
        return new gyt(b, b2, b3, ghfVar, gwcVar, gvgVar, gypVar, str, i);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [evy, java.lang.Object] */
    public final void k() {
        Bitmap bitmap;
        String e;
        String str;
        String bH;
        LogOptions logOptions;
        ((bym) this.d).l(dxq.HELP_AND_FEEDBACK);
        short[] sArr = null;
        try {
            bitmap = fhq.k(((Activity) this.a).getWindow().getDecorView().getRootView());
        } catch (Exception e2) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e2);
            bitmap = null;
        }
        fyw.a((Context) this.a);
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        new ApplicationErrorReport();
        try {
            fyw fywVar = fnu.a;
            String str2 = fywVar.b;
            ContentResolver contentResolver = fyw.a;
            ((Boolean) fywVar.c).booleanValue();
            boolean c = fyo.c(contentResolver, str2, false);
            Boolean.valueOf(c).getClass();
            if (c) {
                e = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                e = fma.e();
            }
        } catch (SecurityException unused) {
            e = fma.e();
        }
        ThemeSettings r = r();
        if (bitmap == null) {
            bitmap = null;
        }
        Account b = this.e.b();
        if (b != null) {
            str = b.name;
        } else {
            str = null;
        }
        Context context = (Context) this.b;
        String bH2 = fma.bH(context);
        if ((bH2 == null || !bH2.contains("_qa")) && (((bH = fma.bH(context)) == null || !bH.contains("_ff")) && !fma.bI(context) && !fma.bJ(context))) {
            logOptions = null;
        } else {
            logOptions = new LogOptions(null, false, true, true, false, null);
        }
        FeedbackOptions feedbackOptions = new FeedbackOptions(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null);
        feedbackOptions.m = bitmap;
        feedbackOptions.f = null;
        feedbackOptions.a = str;
        feedbackOptions.c = null;
        feedbackOptions.b = bundle;
        feedbackOptions.e = null;
        feedbackOptions.h = arrayList;
        feedbackOptions.i = false;
        feedbackOptions.j = r;
        feedbackOptions.k = logOptions;
        feedbackOptions.l = false;
        feedbackOptions.n = e;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = null;
        feedbackOptions.s = null;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(fyo.b((ContentResolver) ((elo) this.c.a()).a, "adm:terms_of_service_url", "https://www.google.com/policies/terms/")));
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(fyo.b((ContentResolver) ((elo) this.c.a()).a, "adm:privacy_policy_url", "http://www.google.com/policies/privacy/")));
        Intent intent3 = new Intent((Context) this.a, (Class<?>) LicenseMenuActivity.class);
        GoogleHelp googleHelp = new GoogleHelp(23, fyo.b((ContentResolver) ((elo) this.c.a()).a, "adm:help_context_string", "fmd_help"), null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null);
        Uri.Builder buildUpon = Uri.parse(fyo.b((ContentResolver) ((elo) this.c.a()).a, "adm:help_url", "https://support.google.com/android/answer/6160491")).buildUpon();
        Locale locale = ((Activity) this.a).getResources().getConfiguration().locale;
        buildUpon.getClass();
        if (locale != null) {
            buildUpon.appendQueryParameter("hl", locale.toLanguageTag());
        }
        googleHelp.q = buildUpon.build();
        googleHelp.s = r();
        Account b2 = this.e.b();
        if (b2 != null) {
            googleHelp.c = b2;
        }
        googleHelp.v = new ErrorReport(feedbackOptions, ((Activity) this.a).getCacheDir());
        googleHelp.v.X = "GoogleHelp";
        googleHelp.a(0, ((Activity) this.a).getString(R.string.action_termsofservice), intent);
        googleHelp.a(1, ((Activity) this.a).getString(R.string.action_privacypolicy), intent2);
        googleHelp.a(2, ((Activity) this.a).getString(R.string.action_opensourcelicenses), intent3);
        gok gokVar = new gok((Activity) this.a);
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        if (putExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") && putExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
            int b3 = fhd.b((Context) gokVar.a, 11925000);
            if (b3 == 0) {
                Object a = gokVar.b.a();
                fpe fpeVar = (fpe) a;
                fma.aR(fpeVar.a);
                fht fhtVar = ((fhq) a).h;
                fpc fpcVar = new fpc(fhtVar, putExtra, new WeakReference(fpeVar.a));
                fhtVar.a(fpcVar);
                fma.aT(fpcVar);
                return;
            }
            Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) putExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
            if (b3 != 7) {
                if (!((Activity) gokVar.a).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
                    new fqw(Looper.getMainLooper()).post(new fbh(gokVar, data, 10, sArr));
                    return;
                }
            } else {
                b3 = 7;
            }
            fhd.i(b3, (Activity) gokVar.a, null);
            return;
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [evy, java.lang.Object] */
    public final void m(Account account) {
        Account b = this.a.b();
        if (b != null && account != null && !amr.g(b.name, account.name)) {
            this.b.i();
        }
        if (!amr.g(account, b)) {
            this.a.k(account);
            if (account != null && !TextUtils.isEmpty(account.name)) {
                ((bym) this.e.a()).h(account.name);
            } else {
                ((bym) this.e.a()).h(null);
            }
            if (n(b)) {
                ?? r1 = this.a;
                r1.f(b, SystemClock.elapsedRealtime());
            }
            if (n(account)) {
                this.a.f(account, -1L);
            }
        }
        if (account == null) {
            this.a.e();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [evy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [lqz, java.lang.Object] */
    public final boolean n(Account account) {
        if (account != null && this.a.l(account)) {
            long a = this.a.a(account);
            if (a == -1) {
                return true;
            }
            if (SystemClock.elapsedRealtime() - a < fyo.a((ContentResolver) ((elo) this.d.a()).a, "adm:auth_timeout_ms", 300000L)) {
                return true;
            }
        }
        return false;
    }

    public nca(dbr dbrVar, dbs dbsVar, dbs dbsVar2, dbs dbsVar3, dbs dbsVar4) {
        this.c = dbrVar;
        this.d = dbsVar;
        this.e = dbsVar2;
        this.a = dbsVar3;
        this.b = dbsVar4;
    }

    public nca(evy evyVar, bym bymVar, Context context, lqz lqzVar, Activity activity) {
        this.e = evyVar;
        this.d = bymVar;
        this.b = context;
        this.c = lqzVar;
        this.a = activity;
    }

    public nca(evy evyVar, ewg ewgVar, lqz lqzVar, lqz lqzVar2, lqz lqzVar3) {
        this.a = evyVar;
        this.b = ewgVar;
        this.d = lqzVar;
        this.e = lqzVar2;
        this.c = lqzVar3;
    }

    private nca(SecretKey secretKey, Cipher cipher, Cipher cipher2, byte[] bArr, byte[] bArr2) {
        this.c = secretKey;
        this.a = cipher;
        this.e = cipher2;
        this.d = bArr;
        this.b = bArr2;
    }

    public nca(lim limVar, hot hotVar, kuv kuvVar, hot hotVar2, jzd jzdVar) {
        this.a = limVar;
        this.b = hotVar;
        this.c = kuvVar;
        this.e = jzdVar;
        this.d = hotVar2;
    }

    public nca(SharedPreferences sharedPreferences, Executor executor) {
        this.c = new ArrayDeque();
        this.a = sharedPreferences;
        this.d = "topic_operation_queue";
        this.e = ",";
        this.b = executor;
    }

    public nca(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5) {
        mkoVar.getClass();
        this.c = mkoVar;
        mkoVar2.getClass();
        this.d = mkoVar2;
        mkoVar3.getClass();
        this.b = mkoVar3;
        mkoVar4.getClass();
        this.e = mkoVar4;
        mkoVar5.getClass();
        this.a = mkoVar5;
    }

    public nca(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, byte[] bArr, byte[] bArr2) {
        mkoVar.getClass();
        this.e = mkoVar;
        mkoVar2.getClass();
        this.a = mkoVar2;
        mkoVar3.getClass();
        this.b = mkoVar3;
        mkoVar4.getClass();
        this.c = mkoVar4;
        mkoVar5.getClass();
        this.d = mkoVar5;
    }

    public nca() {
        this.a = new AtomicReferenceArray(128);
        this.b = new mrr(null, mrs.a);
        this.c = new mrp(0, mrs.a);
        mrs mrsVar = mrs.a;
        this.d = new mrp(0, mrsVar);
        this.e = new mrp(0, mrsVar);
    }

    public nca(hal halVar, frx frxVar, ham hamVar) {
        this.d = halVar.i();
        this.b = halVar.g();
        this.c = halVar.h();
        this.a = halVar.f();
        frxVar.getClass();
        this.e = hamVar;
    }

    public nca(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, byte[] bArr) {
        mkoVar.getClass();
        this.e = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
        mkoVar3.getClass();
        this.c = mkoVar3;
        this.d = mkoVar4;
        mkoVar5.getClass();
        this.a = mkoVar5;
    }

    public nca(Context context, bym bymVar, jzd jzdVar, fma fmaVar) {
        this.a = new HashMap();
        this.b = context;
        this.d = bymVar;
        this.e = jzdVar;
        this.c = fmaVar;
    }
}
