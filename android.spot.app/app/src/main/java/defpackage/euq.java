package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.adm.R;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euq extends lbi {
    public static final /* synthetic */ int a = 0;
    private final bso o;
    private final gok p;

    public euq(Context context, frk frkVar, lao laoVar, bso bsoVar, gok gokVar) {
        super(context, frkVar, laoVar);
        this.o = bsoVar;
        this.p = gokVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.lbi
    public final void a(lam lamVar, MarkerOptions markerOptions) {
        Stream map = Collection.EL.stream(lamVar.c()).map(new eff(19));
        int i = jis.d;
        jis jisVar = (jis) map.collect(jgr.a);
        int size = jisVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            bso bsoVar = this.o;
            frz frzVar = (frz) bsoVar.a.get((dya) jisVar.get(i2));
            if (frzVar != null) {
                frzVar.a(false);
            }
        }
        markerOptions.r = frx.W(this.p.z(jisVar));
    }

    @Override // defpackage.lbi
    public final void b(lam lamVar, fsa fsaVar) {
        Stream map = Collection.EL.stream(lamVar.c()).map(new eff(18));
        int i = jis.d;
        fsaVar.c(frx.W(this.p.z((jis) map.collect(jgr.a))));
    }

    @Override // defpackage.lbi
    public final boolean c(lam lamVar) {
        if (lamVar.a() > 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.lbi
    public final /* bridge */ /* synthetic */ void d(dhx dhxVar, MarkerOptions markerOptions) {
        Object obj = dhxVar.a;
        final lps lpsVar = ((dya) obj).b;
        if (lpsVar.c > 0.0f) {
            final bso bsoVar = this.o;
            Map.EL.compute(bsoVar.a, obj, new BiFunction() { // from class: eup
                public final /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    fse fseVar;
                    frz frzVar = (frz) obj3;
                    if (frzVar == null) {
                        lps lpsVar2 = lpsVar;
                        bso bsoVar2 = bso.this;
                        CircleOptions circleOptions = new CircleOptions();
                        Object obj4 = bsoVar2.c;
                        lnr lnrVar = lpsVar2.b;
                        if (lnrVar == null) {
                            lnrVar = lnr.c;
                        }
                        double d = lnrVar.a;
                        lnr lnrVar2 = lpsVar2.b;
                        if (lnrVar2 == null) {
                            lnrVar2 = lnr.c;
                        }
                        circleOptions.a = new LatLng(d, lnrVar2.b);
                        circleOptions.b = lpsVar2.c;
                        circleOptions.d = bqx.c((Context) bsoVar2.b, R.color.position_marker_stroke);
                        circleOptions.c = ((Context) bsoVar2.b).getResources().getDimensionPixelSize(R.dimen.position_marker_stroke_width);
                        circleOptions.e = bqx.c((Context) bsoVar2.b, R.color.position_marker_fill);
                        try {
                            Object obj5 = ((frk) obj4).a;
                            Parcel a2 = ((duf) obj5).a();
                            duh.c(a2, circleOptions);
                            Parcel b = ((duf) obj5).b(35, a2);
                            IBinder readStrongBinder = b.readStrongBinder();
                            if (readStrongBinder == null) {
                                fseVar = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                                if (queryLocalInterface instanceof fse) {
                                    fseVar = (fse) queryLocalInterface;
                                } else {
                                    fseVar = new fse(readStrongBinder);
                                }
                            }
                            b.recycle();
                            frzVar = new frz(fseVar);
                        } catch (RemoteException e) {
                            throw new fsc(e);
                        }
                    } else {
                        frzVar.a(true);
                    }
                    return frzVar;
                }
            });
        }
        markerOptions.r = frx.W(this.p.y((dya) dhxVar.a));
    }

    @Override // defpackage.lbi
    public final /* bridge */ /* synthetic */ void e(dhx dhxVar, fsa fsaVar) {
        fsaVar.c(frx.W(this.p.y((dya) dhxVar.a)));
    }
}
