package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.apps.adm.R;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gok {
    private static Boolean c;
    public final Object a;
    public final Object b;

    public gok() {
        throw null;
    }

    public static gok C(long j) {
        return new gok(Long.TYPE, Long.valueOf(j));
    }

    private final void D(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6) {
        DisplayMetrics displayMetrics = ((Context) this.a).getResources().getDisplayMetrics();
        Paint paint = new Paint();
        paint.setColor(i);
        float bM = fma.bM(displayMetrics, i6);
        canvas.drawRoundRect(fma.bM(displayMetrics, i2), fma.bM(displayMetrics, i3), fma.bM(displayMetrics, i4), fma.bM(displayMetrics, i5), bM, bM, paint);
    }

    public static boolean v(Context context) {
        fma.aR(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public final jyz A(final jyz jyzVar) {
        final jzm jzmVar = new jzm();
        jyzVar.c(new Runnable() { // from class: elt
            @Override // java.lang.Runnable
            public final void run() {
                jzm jzmVar2 = jzmVar;
                if (gok.this.B()) {
                    jzmVar2.n(new elu());
                } else {
                    jzmVar2.o(jyzVar);
                }
            }
        }, jxv.a);
        return jzmVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [evy, java.lang.Object] */
    public final boolean B() {
        if (!((Account) this.a).equals(this.b.b())) {
            return true;
        }
        return false;
    }

    public final List a() {
        return (List) bwr.c((cih) this.a, true, false, new gom());
    }

    public final Long[] b(List list) {
        return (Long[]) bwr.c((cih) this.a, false, true, new glf(list, 2));
    }

    public final void c(List list) {
        ((Integer) bwr.c((cih) this.a, false, true, new glg(this, list, 2))).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized Object d(gwf gwfVar) {
        Object obj = this.a.get(gwfVar);
        if (obj == null) {
            Object a = this.b.a(gwfVar);
            this.a.put(gwfVar, a);
            return a;
        }
        return obj;
    }

    public final void e() {
        if (((jer) this.a).g()) {
        } else {
            throw new IllegalStateException("GnpChimeRegistrationDataProvider must be provided for GNP system tray registrations");
        }
    }

    public final Object f() {
        e();
        return ((gye) ((jer) this.a).c()).d();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [msw, java.lang.Object] */
    public final jyz g(lgp lgpVar) {
        lgpVar.getClass();
        return mpd.r(this.b, new dzk(this, lgpVar, (mmx) null, 11));
    }

    public final imf h(goa goaVar) {
        goaVar.getClass();
        ijy ijyVar = new ijy((Context) this.a);
        ijyVar.d("notifications_counts_data_store");
        ijyVar.e(goaVar.a + "_StoredNotificationsCounts.pb");
        Uri a = ijyVar.a();
        ilt a2 = ilu.a();
        a2.d(a);
        a2.c(gig.d);
        a2.b = ill.a;
        return ((ilv) this.b).a(a2.a());
    }

    public final jyz i() {
        Feature[] featureArr;
        Feature[] featureArr2;
        SyncRequest syncRequest = new SyncRequest(1, new byte[0], new SyncOptions());
        fjy fjyVar = new fjy();
        fjyVar.a = new fpx(syncRequest, this.a, 3);
        int i = syncRequest.c - 1;
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                featureArr2 = new Feature[0];
                Object obj = this.b;
                fjyVar.b = featureArr2;
                fjyVar.c = 15902;
                return iuu.p(fzo.b(((fhq) obj).f(fjyVar.a())), new etl(5), jxv.a);
            }
            featureArr = new Feature[]{fsg.a};
        } else {
            featureArr = new Feature[]{fsg.b};
        }
        featureArr2 = featureArr;
        Object obj2 = this.b;
        fjyVar.b = featureArr2;
        fjyVar.c = 15902;
        return iuu.p(fzo.b(((fhq) obj2).f(fjyVar.a())), new etl(5), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final jyz j(gfr gfrVar, int i) {
        Uri parse;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            parse = Uri.parse(gfrVar.f);
                        } else {
                            parse = Uri.parse(gfrVar.e);
                        }
                    } else {
                        parse = Uri.parse(gfrVar.d);
                    }
                } else {
                    parse = Uri.parse(gfrVar.c);
                }
            } else {
                parse = Uri.parse(gfrVar.b);
            }
        } else {
            parse = Uri.parse(gfrVar.a);
        }
        return ivc.J(new etm(this, parse, 5), this.b);
    }

    public final void k(int i, gfc gfcVar) {
        gfcVar.getClass();
        ffb h = ((ffc) this.a).h(gfcVar, fzz.b((Context) this.b, new nda()));
        h.g(i - 1);
        h.c();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void l(ljk ljkVar, List list, lkp lkpVar, List list2) {
        gcv gcvVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            mko mkoVar = (mko) this.a.get(num);
            if (mkoVar == null) {
                gcvVar = null;
            } else {
                gcvVar = (gcv) mkoVar.a();
            }
            if (gcvVar != null) {
                nqe b = ((lja) this.b).b((ljk) ((ljn) ljkVar.z(6)), num.intValue());
                if (b == null) {
                    frx.p(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(ljkVar.getClass()) + "is properly extended."));
                } else {
                    ljkVar.h(b);
                    Object k = ljkVar.l.k((ljm) b.d);
                    if (k == null) {
                        k = b.a;
                    } else {
                        b.h(k);
                    }
                    jyz a = gcvVar.a((lkq) k);
                    if (gcv.a.equals(a)) {
                        continue;
                    } else if (lkpVar != null) {
                        try {
                            ((gcu) ivc.M(a)).a(lkpVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(a);
                    }
                }
            }
        }
    }

    public final void m(eur eurVar) {
        try {
            Object obj = this.a;
            fru fruVar = new fru(eurVar);
            Parcel a = ((duf) obj).a();
            duh.d(a, fruVar);
            ((duf) obj).c(12, a);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    protected final String n(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.a).concat(str);
    }

    public final void o(String str, Object... objArr) {
        Log.e((String) this.b, n(str, objArr));
    }

    public final void p(String str, Throwable th, Object... objArr) {
        Log.e((String) this.b, n(str, objArr), th);
    }

    public final void q(String str, Object... objArr) {
        Log.w((String) this.b, n(str, objArr));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final void r(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((bym) entry2.getKey()).t(new fhn(status));
            }
        }
    }

    public final void s() {
        fcn e = fcn.e((Context) this.b);
        fdn h = e.h();
        fdc fdcVar = e.c;
        h.y("Local AnalyticsService is starting up");
    }

    public final void t() {
        fcn e = fcn.e((Context) this.b);
        fdn h = e.h();
        fdc fdcVar = e.c;
        h.y("Local AnalyticsService is shutting down");
    }

    public final void u(Runnable runnable) {
        fcn.e((Context) this.b).d().c(new fdt(this, runnable));
    }

    public final void w(Intent intent, int i) {
        try {
            synchronized (fds.a) {
                fxg fxgVar = fds.b;
                if (fxgVar != null && fxgVar.e()) {
                    fxgVar.b();
                }
            }
        } catch (SecurityException unused) {
        }
        fcn e = fcn.e((Context) this.b);
        fdn h = e.h();
        if (intent == null) {
            h.B("AnalyticsService started with null intent");
            return;
        }
        fdc fdcVar = e.c;
        String action = intent.getAction();
        h.A("Local AnalyticsService called. startId, action", Integer.valueOf(i), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            u(new oa(this, i, h, 5));
        }
    }

    public final Object x() {
        synchronized (this.b) {
        }
        return this.a;
    }

    public final Bitmap y(dya dyaVar) {
        return z(jis.q(dyaVar));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [euv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [euv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [euv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [euv, java.lang.Object] */
    public final Bitmap z(jis jisVar) {
        euz euzVar;
        int e;
        boolean anyMatch = Collection.EL.stream(jisVar).anyMatch(new eju(13));
        boolean anyMatch2 = Collection.EL.stream(jisVar).map(new eff(20)).anyMatch(new eju(14));
        if (anyMatch2) {
            if (anyMatch) {
                euzVar = euz.LARGE_BITMAP;
            } else {
                euzVar = euz.BITMAP;
            }
        } else {
            euzVar = euz.DRAWABLE;
        }
        Object obj = this.b;
        Stream map = Collection.EL.stream(jisVar).sorted(Comparator.CC.comparing(new evl(1))).map(new egd(obj, euzVar, 6, null));
        int i = jis.d;
        jis jisVar2 = (jis) map.collect(jgr.a);
        int i2 = euzVar.e;
        gok gokVar = (gok) obj;
        int b = gokVar.b.b();
        if (anyMatch2) {
            e = gokVar.b.b();
        } else if (anyMatch) {
            e = gokVar.b.a();
        } else {
            e = gokVar.b.e();
        }
        int i3 = e;
        if (jisVar2 != null) {
            eux euxVar = new eux(jisVar2, euzVar.g, euzVar.f, i2, b, i3);
            DisplayMetrics displayMetrics = ((Context) this.a).getResources().getDisplayMetrics();
            int sum = Collection.EL.stream(euxVar.a).mapToInt(new euy(1)).sum() + (euxVar.d * (euxVar.a.size() + 1));
            int i4 = 0;
            int orElse = Collection.EL.stream(euxVar.a).mapToInt(new euy(1)).max().orElse(0);
            int i5 = euxVar.d;
            int i6 = orElse + i5 + i5;
            Bitmap createBitmap = Bitmap.createBitmap(fma.bM(displayMetrics, sum), fma.bM(displayMetrics, euxVar.c + i6), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i7 = euxVar.e;
            Drawable drawable = ((Context) this.a).getDrawable(R.drawable.map_pin);
            drawable.getClass();
            Drawable mutate = bpu.i(drawable).mutate();
            int intrinsicWidth = mutate.getIntrinsicWidth();
            int intrinsicHeight = mutate.getIntrinsicHeight();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            bsc.f(mutate, i7);
            mutate.setBounds((width - intrinsicWidth) / 2, height - intrinsicHeight, (width + intrinsicWidth) / 2, height);
            mutate.draw(canvas);
            D(canvas, euxVar.e, 0, 0, sum, i6, i6);
            int i8 = euxVar.f;
            int i9 = euxVar.b;
            int i10 = i6 - i9;
            D(canvas, i8, i9, i9, sum - i9, i10, i10);
            int bM = fma.bM(displayMetrics, euxVar.d);
            int bM2 = fma.bM(displayMetrics, i6);
            int i11 = bM;
            while (i4 < euxVar.a.size()) {
                euw euwVar = (euw) euxVar.a.get(i4);
                int bM3 = fma.bM(displayMetrics, euwVar.b);
                Drawable drawable2 = euwVar.a;
                Optional optional = euwVar.c;
                Optional optional2 = euwVar.d;
                Drawable mutate2 = bpu.i(drawable2).mutate();
                optional.ifPresent(new ebd(mutate2, 10));
                mutate2.setBounds(i11, (bM2 - bM3) / 2, i11 + bM3, (bM2 + bM3) / 2);
                optional2.isPresent();
                mutate2.draw(canvas);
                i11 += bM3 + bM;
                i4++;
                bM2 = bM2;
            }
            return createBitmap;
        }
        throw new NullPointerException("Null iconDrawables");
    }

    public gok(Activity activity) {
        this.a = activity;
        this.b = new enj(activity, 7);
    }

    public gok(cih cihVar) {
        this.a = cihVar;
        this.b = new gol();
    }

    public gok(ddg ddgVar) {
        this.a = ddgVar;
        this.b = new gbw(ddgVar);
    }

    public gok(fcn fcnVar) {
        this.b = fcnVar;
        this.a = new fdi();
    }

    public gok(gnv gnvVar, gur gurVar) {
        this.a = gnvVar;
        this.b = gurVar;
    }

    public gok(Object obj) {
        this.b = new Object();
        this.a = obj;
    }

    public gok(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public gok(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public gok(ag agVar, frt frtVar) {
        this.a = frtVar;
        fma.aR(agVar);
        this.b = agVar;
    }

    public gok(Context context, byte[] bArr) {
        this.b = context;
        this.a = new fqw();
    }

    public gok(Context context, byte[] bArr, byte[] bArr2) {
        fma.aR(context);
        Context applicationContext = context.getApplicationContext();
        fma.aS(applicationContext, "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }

    public gok(evy evyVar) {
        this.b = evyVar;
        Account b = evyVar.b();
        b.getClass();
        this.a = b;
    }

    public gok(gnh gnhVar) {
        this.a = new HashMap();
        this.b = gnhVar;
    }

    public gok(Map map) {
        this.b = lja.a();
        this.a = map;
    }

    public gok(Context context) {
        ffc ffcVar = new ffc(context, "PROFILE_SYNC_VERBOSE", null);
        this.b = context;
        this.a = ffcVar;
    }

    public gok(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new CloudMessagingMessengerCompat(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public gok(mko mkoVar, mko mkoVar2) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
    }

    public gok(Context context, fsl fslVar, Account account, jfe jfeVar, jfe jfeVar2) {
        this.b = fslVar;
        this.a = new CallerInfo("profile-".concat("OneGoogle"), 1L);
        gfv gfvVar = new gfv(jfeVar2, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(gfvVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(gfvVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        gfw gfwVar = new gfw(jfeVar, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(gfwVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(gfwVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    public gok(ilv ilvVar, Context context) {
        ilvVar.getClass();
        this.b = ilvVar;
        this.a = context;
    }

    public gok(byte[] bArr) {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public gok(jer jerVar, mnb mnbVar) {
        jerVar.getClass();
        this.a = jerVar;
        this.b = mnbVar;
    }

    public gok(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String str = strArr[0];
        if (sb.length() > 1) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("] ");
        this.a = sb.toString();
        this.b = "Auth";
        fma.aH(true, "tag \"%s\" is longer than the %d character maximum", "Auth", 23);
        for (int i = 2; i <= 7 && !Log.isLoggable((String) this.b, i); i++) {
        }
    }
}
