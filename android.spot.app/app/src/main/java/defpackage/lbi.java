package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.RotationLayout;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbi implements lax {
    private static final int[] a = {10, 20, 50, 100, 200, 500, 1000};
    public static final TimeInterpolator b = new DecelerateInterpolator();
    public final frk c;
    public final lao d;
    public Set i;
    public float j;
    public njz m;
    public njz n;
    private final lbr o;
    private final float p;
    private final ShapeDrawable q;
    public final Executor g = Executors.newSingleThreadExecutor();
    public Set h = Collections.newSetFromMap(new ConcurrentHashMap());
    private final SparseArray r = new SparseArray();
    public final kuv k = new kuv();
    public final kuv l = new kuv();
    private final lbh s = new lbh(this);
    public final boolean e = true;
    public final long f = 300;

    public lbi(Context context, frk frkVar, lao laoVar) {
        TextView textView;
        this.c = frkVar;
        float f = context.getResources().getDisplayMetrics().density;
        this.p = f;
        lbr lbrVar = new lbr(context);
        this.o = lbrVar;
        lbs lbsVar = new lbs(context);
        lbsVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        lbsVar.setId(R.id.amu_text);
        int i = (int) (12.0f * f);
        lbsVar.setPadding(i, i, i, i);
        ((RotationLayout) lbrVar.c).removeAllViews();
        ((RotationLayout) lbrVar.c).addView(lbsVar);
        View findViewById = ((RotationLayout) lbrVar.c).findViewById(R.id.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        lbrVar.d = textView;
        lbrVar.c();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.q = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        int i2 = (int) (f * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        lbrVar.a(layerDrawable);
        this.d = laoVar;
    }

    public static final Set p(Set set) {
        if (set != null) {
            return DesugarCollections.unmodifiableSet(set);
        }
        return Collections.emptySet();
    }

    public void a(lam lamVar, MarkerOptions markerOptions) {
        markerOptions.r = q(lamVar);
    }

    public void b(lam lamVar, fsa fsaVar) {
        fsaVar.c(q(lamVar));
    }

    public boolean c(lam lamVar) {
        if (lamVar.a() >= 4) {
            return true;
        }
        return false;
    }

    public void e(dhx dhxVar, fsa fsaVar) {
        if (!fsaVar.a().equals(dhxVar.n())) {
            fsaVar.b(dhxVar.n());
            dhx.o();
            float floatValue = dhx.o().floatValue();
            try {
                fsf fsfVar = fsaVar.a;
                Parcel a2 = fsfVar.a();
                a2.writeFloat(floatValue);
                fsfVar.c(27, a2);
                try {
                    fsf fsfVar2 = fsaVar.a;
                    Parcel b2 = fsfVar2.b(13, fsfVar2.a());
                    boolean e = duh.e(b2);
                    b2.recycle();
                    if (e) {
                        try {
                            fsf fsfVar3 = fsaVar.a;
                            fsfVar3.c(11, fsfVar3.a());
                        } catch (RemoteException e2) {
                            throw new fsc(e2);
                        }
                    }
                } catch (RemoteException e3) {
                    throw new fsc(e3);
                }
            } catch (RemoteException e4) {
                throw new fsc(e4);
            }
        }
    }

    @Override // defpackage.lax
    public final void f() {
        lbb lbbVar = new lbb(this);
        lao laoVar = this.d;
        lbj lbjVar = laoVar.d;
        lbjVar.e = lbbVar;
        lbjVar.c = new lbc();
        final int i = 1;
        lbjVar.d = new fri() { // from class: lba
            @Override // defpackage.fri
            public final void b(fsa fsaVar) {
            }
        };
        frj frjVar = new frj() { // from class: lay
            @Override // defpackage.frj
            public final void c(fsa fsaVar) {
                lbi lbiVar = lbi.this;
                njz njzVar = lbiVar.m;
                if (njzVar != null) {
                    ((eur) njzVar.a).aH();
                }
            }
        };
        lbj lbjVar2 = laoVar.e;
        lbjVar2.e = frjVar;
        lbjVar2.c = new frh() { // from class: laz
            @Override // defpackage.frh
            public final void a(fsa fsaVar) {
            }
        };
        final int i2 = 0;
        lbjVar2.d = new fri() { // from class: lba
            @Override // defpackage.fri
            public final void b(fsa fsaVar) {
            }
        };
    }

    @Override // defpackage.lax
    public final void g(Set set) {
        lbh lbhVar = this.s;
        synchronized (lbhVar) {
            lbhVar.a = new lbg(lbhVar.b, set);
        }
        lbhVar.sendEmptyMessage(0);
    }

    @Override // defpackage.lax
    public final void h() {
        lao laoVar = this.d;
        lbj lbjVar = laoVar.d;
        lbjVar.e = null;
        lbjVar.c = null;
        lbjVar.d = null;
        lbj lbjVar2 = laoVar.e;
        lbjVar2.e = null;
        lbjVar2.c = null;
        lbjVar2.d = null;
    }

    @Override // defpackage.lax
    public final void m(njz njzVar) {
        this.m = njzVar;
    }

    @Override // defpackage.lax
    public final void n(njz njzVar) {
        this.n = njzVar;
    }

    public final lbm o(List list, lbm lbmVar) {
        lbm lbmVar2 = null;
        if (list != null && !list.isEmpty()) {
            laq laqVar = this.d.b.a;
            Iterator it = list.iterator();
            double d = 10000.0d;
            while (it.hasNext()) {
                lbm lbmVar3 = (lbm) it.next();
                double d2 = lbmVar3.a - lbmVar.a;
                double d3 = lbmVar3.b - lbmVar.b;
                double d4 = (d2 * d2) + (d3 * d3);
                if (d4 < d) {
                    lbmVar2 = lbmVar3;
                }
                if (d4 < d) {
                    d = d4;
                }
            }
        }
        return lbmVar2;
    }

    protected final bym q(lam lamVar) {
        String str;
        int a2 = lamVar.a();
        if (a2 > a[0]) {
            int i = 0;
            while (true) {
                if (i < 6) {
                    int i2 = i + 1;
                    int[] iArr = a;
                    if (a2 < iArr[i2]) {
                        a2 = iArr[i];
                        break;
                    }
                    i = i2;
                } else {
                    a2 = a[6];
                    break;
                }
            }
        }
        bym bymVar = (bym) this.r.get(a2);
        if (bymVar == null) {
            Paint paint = this.q.getPaint();
            float min = 300.0f - Math.min(a2, 300.0f);
            paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
            this.o.c();
            lbr lbrVar = this.o;
            if (a2 < a[0]) {
                str = String.valueOf(a2);
            } else {
                str = a2 + "+";
            }
            Object obj = lbrVar.d;
            if (obj != null) {
                ((TextView) obj).setText(str);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((ViewGroup) lbrVar.b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth = ((ViewGroup) lbrVar.b).getMeasuredWidth();
            int measuredHeight = ((ViewGroup) lbrVar.b).getMeasuredHeight();
            ((ViewGroup) lbrVar.b).layout(0, 0, measuredWidth, measuredHeight);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            ((ViewGroup) lbrVar.b).draw(new Canvas(createBitmap));
            bym W = frx.W(createBitmap);
            this.r.put(a2, W);
            return W;
        }
        return bymVar;
    }

    @Override // defpackage.lax
    public final void i() {
    }

    @Override // defpackage.lax
    public final void j() {
    }

    @Override // defpackage.lax
    public final void k() {
    }

    @Override // defpackage.lax
    public final void l() {
    }

    public void d(dhx dhxVar, MarkerOptions markerOptions) {
    }
}
