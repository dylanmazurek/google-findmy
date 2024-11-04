package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [mnw, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        Object obj2;
        switch (this.b) {
            case 0:
                ((nm) this.a).c(false);
                return;
            case 1:
                ((Toolbar) this.a).x();
                return;
            case 2:
                ((nm) this.a).a();
                return;
            case 3:
                ((oc) this.a).invalidateOptionsMenu();
                return;
            case 4:
                nz nzVar = (nz) this.a;
                Runnable runnable = nzVar.a;
                if (runnable != null) {
                    runnable.run();
                    nzVar.a = null;
                    return;
                }
                return;
            case 5:
                try {
                    oc.j((oc) this.a);
                    return;
                } catch (IllegalStateException e) {
                    if (amr.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    if (!amr.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 6:
                od.g((od) this.a);
                return;
            case 7:
                ((qr) this.a).a.m();
                return;
            case 8:
                ((qr) this.a).a.m();
                return;
            case 9:
                ((qr) this.a).a.r = false;
                return;
            case 10:
                ((qr) this.a).a.m().b();
                return;
            case 11:
                Object obj3 = this.a;
                Context x = ((ag) obj3).x();
                if (x == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                rg rgVar = (rg) obj3;
                rgVar.ah.i(1);
                rgVar.ah.h(x.getString(R.string.fingerprint_dialog_touch_sensor));
                return;
            case 12:
                baw bawVar = (baw) this.a;
                bawVar.y = false;
                MotionEvent motionEvent = bawVar.w;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    bawVar.g(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            case 13:
                ((baw) this.a).removeCallbacks(this);
                MotionEvent motionEvent2 = ((baw) this.a).w;
                if (motionEvent2 != null) {
                    int toolType = motionEvent2.getToolType(0);
                    int actionMasked = motionEvent2.getActionMasked();
                    if (toolType == 3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    } else {
                        i = 7;
                    }
                    baw bawVar2 = (baw) this.a;
                    bawVar2.A(motionEvent2, i, bawVar2.x, false);
                    return;
                }
                return;
            case 14:
                this.a.a();
                return;
            case 15:
                Object obj4 = this.a;
                Activity activity = (Activity) obj4;
                if (!activity.isFinishing()) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity.recreate();
                        return;
                    }
                    if ((!bpc.a() || bpc.f != null) && (bpc.e != null || bpc.d != null)) {
                        try {
                            Object obj5 = bpc.c.get(obj4);
                            if (obj5 != null && (obj = bpc.b.get(obj4)) != null) {
                                Application application = ((Activity) obj4).getApplication();
                                bpb bpbVar = new bpb((Activity) obj4);
                                application.registerActivityLifecycleCallbacks(bpbVar);
                                bpc.g.post(new bx(bpbVar, obj5, 10, (char[]) null));
                                try {
                                    if (bpc.a()) {
                                        bpc.f.invoke(obj, obj5, null, null, 0, false, null, null, false, false);
                                    } else {
                                        ((Activity) obj4).recreate();
                                    }
                                    return;
                                } finally {
                                    bpc.g.post(new bx(application, bpbVar, 11, (char[]) null));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 16:
                bzk bzkVar = (bzk) this.a;
                if (!bzkVar.e) {
                    return;
                }
                if (bzkVar.c) {
                    bzkVar.c = false;
                    bzj bzjVar = bzkVar.a;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    bzjVar.e = currentAnimationTimeMillis;
                    bzjVar.g = -1L;
                    bzjVar.f = currentAnimationTimeMillis;
                    bzjVar.h = 0.5f;
                }
                bzj bzjVar2 = ((bzk) this.a).a;
                if ((bzjVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > bzjVar2.g + bzjVar2.i) || !((bzk) this.a).b()) {
                    ((bzk) this.a).e = false;
                    return;
                }
                bzk bzkVar2 = (bzk) this.a;
                if (bzkVar2.d) {
                    bzkVar2.d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    bzkVar2.b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (bzjVar2.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = bzjVar2.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - bzjVar2.f;
                    bzjVar2.f = currentAnimationTimeMillis2;
                    ((bzk) this.a).f.scrollListBy((int) (((float) j) * (((-4.0f) * a * a) + (a * 4.0f)) * bzjVar2.d));
                    Object obj6 = this.a;
                    int[] iArr = bwn.a;
                    ((bzk) obj6).b.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            case 17:
                ((cai) this.a).f(0);
                return;
            case 18:
                njz njzVar = ((ccm) this.a).i;
                ((ccm) njzVar.a).d = SystemClock.uptimeMillis();
                ccm ccmVar = (ccm) njzVar.a;
                long j2 = ccmVar.d;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i2 = 0; i2 < ccmVar.b.size(); i2++) {
                    ccv ccvVar = (ccv) ccmVar.b.get(i2);
                    if (ccvVar != null) {
                        Long l = (Long) ccmVar.a.get(ccvVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                ccmVar.a.remove(ccvVar);
                            }
                        }
                        ccvVar.b(j2);
                    }
                }
                if (ccmVar.e) {
                    int size = ccmVar.b.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            if (ccmVar.b.get(size) == null) {
                                ccmVar.b.remove(size);
                            }
                        } else {
                            if (ccmVar.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                cck cckVar = ccmVar.g;
                                ValueAnimator.unregisterDurationScaleChangeListener(cckVar.a);
                                cckVar.a = null;
                            }
                            ccmVar.e = false;
                        }
                    }
                }
                if (((ccm) njzVar.a).b.size() > 0) {
                    ccm ccmVar2 = (ccm) njzVar.a;
                    ccmVar2.h.C(ccmVar2.c);
                    return;
                }
                return;
            case 19:
                synchronized (((cfk) this.a).c) {
                    obj2 = ((cfk) this.a).f;
                    ((cfk) this.a).f = cfk.b;
                }
                ((cfk) this.a).l(obj2);
                return;
            default:
                ((SwipeRefreshLayout) this.a).b();
                return;
        }
    }

    public nl(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
