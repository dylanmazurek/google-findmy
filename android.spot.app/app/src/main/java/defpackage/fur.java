package defpackage;

import com.google.android.gms.nearby.uwb.internal.DlTdoaMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingResultParams;
import com.google.android.gms.nearby.uwb.internal.RangingMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.RangingPositionParams;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fur extends ftk {
    final /* synthetic */ OnRangingResultParams a;

    public fur(OnRangingResultParams onRangingResultParams) {
        this.a = onRangingResultParams;
    }

    @Override // defpackage.fjn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ftm ftmVar;
        ftm ftmVar2;
        ftp ftpVar = (ftp) obj;
        fud.c(this.a.a);
        RangingPositionParams rangingPositionParams = this.a.b;
        ftm b = fud.b(rangingPositionParams.a);
        RangingMeasurementParams rangingMeasurementParams = rangingPositionParams.b;
        if (rangingMeasurementParams != null) {
            ftmVar = fud.b(rangingMeasurementParams);
        } else {
            ftmVar = null;
        }
        RangingMeasurementParams rangingMeasurementParams2 = rangingPositionParams.c;
        if (rangingMeasurementParams2 != null) {
            ftmVar2 = fud.b(rangingMeasurementParams2);
        } else {
            ftmVar2 = null;
        }
        long j = rangingPositionParams.d;
        int i = rangingPositionParams.e;
        DlTdoaMeasurementParams dlTdoaMeasurementParams = rangingPositionParams.f;
        ftpVar.b(new fto(b, ftmVar, ftmVar2, j, i));
    }
}
