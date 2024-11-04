package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.nearby.uwb.internal.RangeDataNtfConfigParams;
import com.google.android.gms.nearby.uwb.internal.RangingParametersParams;
import com.google.android.gms.nearby.uwb.internal.StartRangingParams;
import com.google.android.gms.nearby.uwb.internal.UwbAddressParams;
import com.google.android.gms.nearby.uwb.internal.UwbComplexChannelParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fuo implements fju {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fuo(Account account, String str, Bundle bundle, int i) {
        this.d = i;
        this.b = account;
        this.c = str;
        this.a = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [fue, java.lang.Object] */
    @Override // defpackage.fju
    public final void a(Object obj, Object obj2) {
        UwbDeviceParams[] uwbDeviceParamsArr;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                fwo fwoVar = new fwo((fjo) this.a, 2);
                ((fym) obj).I((fwo) this.c, fwoVar, new fya((fhq) this.b, (bym) obj2, fwoVar));
                return;
            }
            feo feoVar = (feo) ((fem) obj).v();
            fen fenVar = new fen((bym) obj2, 2, (char[]) null);
            Parcel a = feoVar.a();
            duh.d(a, fenVar);
            duh.c(a, this.b);
            a.writeString((String) this.c);
            duh.c(a, this.a);
            feoVar.c(1, a);
            return;
        }
        fty ftyVar = (fty) ((fum) obj).v();
        StartRangingParams startRangingParams = new StartRangingParams();
        RangingParametersParams rangingParametersParams = new RangingParametersParams();
        ftn ftnVar = (ftn) this.b;
        rangingParametersParams.b = ftnVar.b;
        rangingParametersParams.a = ftnVar.a;
        rangingParametersParams.e = 3;
        if (ftnVar.e.isEmpty()) {
            uwbDeviceParamsArr = new UwbDeviceParams[0];
        } else {
            uwbDeviceParamsArr = new UwbDeviceParams[ftnVar.e.size()];
            int i2 = 0;
            for (fts ftsVar : ftnVar.e) {
                UwbDeviceParams uwbDeviceParams = new UwbDeviceParams();
                UwbAddressParams uwbAddressParams = new UwbAddressParams();
                uwbAddressParams.a = ftsVar.a.a;
                uwbDeviceParams.a = uwbAddressParams;
                uwbDeviceParamsArr[i2] = uwbDeviceParams;
                i2++;
            }
        }
        Object obj3 = this.a;
        rangingParametersParams.f = uwbDeviceParamsArr;
        UwbDeviceParams uwbDeviceParams2 = new UwbDeviceParams();
        UwbAddressParams uwbAddressParams2 = new UwbAddressParams();
        uwbAddressParams2.a = ((ftq) obj3).a;
        uwbDeviceParams2.a = uwbAddressParams2;
        rangingParametersParams.i = uwbDeviceParams2;
        rangingParametersParams.k = 2;
        rangingParametersParams.m = false;
        rangingParametersParams.c = ftnVar.c;
        ftr ftrVar = ftnVar.d;
        UwbComplexChannelParams uwbComplexChannelParams = new UwbComplexChannelParams();
        uwbComplexChannelParams.a = ftrVar.a;
        uwbComplexChannelParams.b = ftrVar.b;
        rangingParametersParams.d = uwbComplexChannelParams;
        ?? r1 = this.c;
        RangeDataNtfConfigParams rangeDataNtfConfigParams = new RangeDataNtfConfigParams();
        rangeDataNtfConfigParams.a = 1;
        rangeDataNtfConfigParams.b = 0;
        rangeDataNtfConfigParams.c = 20000;
        rangingParametersParams.j = rangeDataNtfConfigParams;
        startRangingParams.b = rangingParametersParams;
        startRangingParams.c = r1;
        startRangingParams.a = new fug((bym) obj2);
        Parcel a2 = ftyVar.a();
        duh.c(a2, startRangingParams);
        ftyVar.d(1005, a2);
    }

    public /* synthetic */ fuo(fhq fhqVar, fjo fjoVar, fwo fwoVar, int i) {
        this.d = i;
        this.b = fhqVar;
        this.a = fjoVar;
        this.c = fwoVar;
    }

    public /* synthetic */ fuo(ftq ftqVar, ftn ftnVar, fud fudVar, int i) {
        this.d = i;
        this.a = ftqVar;
        this.b = ftnVar;
        this.c = fudVar;
    }
}
