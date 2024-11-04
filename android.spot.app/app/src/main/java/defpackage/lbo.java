package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbo {
    final double a;

    public lbo(double d) {
        this.a = d;
    }

    public final LatLng a(lbm lbmVar) {
        double d = -(0.5d - (lbmVar.b / this.a));
        double atan = Math.atan(Math.exp((d + d) * 3.141592653589793d));
        return new LatLng(90.0d - Math.toDegrees(atan + atan), ((lbmVar.a / this.a) - 0.5d) * 360.0d);
    }

    public final lbn b(LatLng latLng) {
        double d = latLng.b / 360.0d;
        double sin = Math.sin(Math.toRadians(latLng.a));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d2 = this.a;
        return new lbn((d + 0.5d) * d2, log * d2);
    }
}
