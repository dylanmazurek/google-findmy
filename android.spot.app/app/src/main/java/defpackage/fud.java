package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.uwb.internal.OnPeerDisconnectedParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingInitializedParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingResultParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingSuspendedParams;
import com.google.android.gms.nearby.uwb.internal.RangingMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fud extends dug implements fue {
    public final fjo a;
    public final ftp b;
    final /* synthetic */ fuu c;

    public fud() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
    }

    public static ftm b(RangingMeasurementParams rangingMeasurementParams) {
        int i = rangingMeasurementParams.a;
        return new ftm(rangingMeasurementParams.b);
    }

    public static void c(UwbDeviceParams uwbDeviceParams) {
        fts.a(uwbDeviceParams.a.a);
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 5;
        int i3 = 3;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    OnPeerDisconnectedParams onPeerDisconnectedParams = (OnPeerDisconnectedParams) duh.a(parcel, OnPeerDisconnectedParams.CREATOR);
                    duh.b(parcel);
                    this.a.b(new fut(onPeerDisconnectedParams));
                } else {
                    OnRangingSuspendedParams onRangingSuspendedParams = (OnRangingSuspendedParams) duh.a(parcel, OnRangingSuspendedParams.CREATOR);
                    duh.b(parcel);
                    this.a.b(new fus(this, onRangingSuspendedParams));
                }
            } else {
                OnRangingResultParams onRangingResultParams = (OnRangingResultParams) duh.a(parcel, OnRangingResultParams.CREATOR);
                duh.b(parcel);
                this.a.b(new fur(onRangingResultParams));
            }
        } else {
            OnRangingInitializedParams onRangingInitializedParams = (OnRangingInitializedParams) duh.a(parcel, OnRangingInitializedParams.CREATOR);
            duh.b(parcel);
            fbh fbhVar = new fbh((Object) this, (Object) onRangingInitializedParams, 12, (byte[]) null);
            fuu fuuVar = this.c;
            fjt fjtVar = new fjt();
            fjtVar.a = new fsw(fbhVar, i2);
            fjtVar.b = new fun(i3);
            fjtVar.c = this.a;
            fjtVar.d = new Feature[]{ftb.i};
            fjtVar.f = 1304;
            fuuVar.p(fjtVar.a());
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fud(fuu fuuVar, ftp ftpVar) {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
        this.c = fuuVar;
        this.a = fuuVar.d(ftpVar, ftp.class.getName());
        this.b = ftpVar;
    }
}
