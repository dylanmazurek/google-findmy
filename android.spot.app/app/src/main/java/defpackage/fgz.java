package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.R;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fgz(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, getServiceRequest.c);
        fma.L(parcel, 2, getServiceRequest.d);
        fma.L(parcel, 3, getServiceRequest.e);
        fma.X(parcel, 4, getServiceRequest.f);
        fma.R(parcel, 5, getServiceRequest.g);
        fma.aa(parcel, 6, getServiceRequest.h, i);
        fma.O(parcel, 7, getServiceRequest.i);
        fma.W(parcel, 8, getServiceRequest.j, i);
        fma.aa(parcel, 10, getServiceRequest.k, i);
        fma.aa(parcel, 11, getServiceRequest.l, i);
        fma.G(parcel, 12, getServiceRequest.m);
        fma.L(parcel, 13, getServiceRequest.n);
        fma.G(parcel, 14, getServiceRequest.o);
        fma.X(parcel, 15, getServiceRequest.p);
        fma.F(parcel, D);
    }

    public static final ErrorReport b(Parcel parcel) {
        int aj = fma.aj(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        String str32 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        ServiceDump[] serviceDumpArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < aj) {
            int ag = fma.ag(parcel);
            switch (fma.af(ag)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) fma.an(parcel, ag, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = fma.as(parcel, ag);
                    break;
                case 4:
                    i = fma.ah(parcel, ag);
                    break;
                case 5:
                    str2 = fma.as(parcel, ag);
                    break;
                case 6:
                    str3 = fma.as(parcel, ag);
                    break;
                case 7:
                    str4 = fma.as(parcel, ag);
                    break;
                case 8:
                    str5 = fma.as(parcel, ag);
                    break;
                case 9:
                    str6 = fma.as(parcel, ag);
                    break;
                case 10:
                    str7 = fma.as(parcel, ag);
                    break;
                case 11:
                    str8 = fma.as(parcel, ag);
                    break;
                case 12:
                    i2 = fma.ah(parcel, ag);
                    break;
                case 13:
                    str9 = fma.as(parcel, ag);
                    break;
                case 14:
                    str10 = fma.as(parcel, ag);
                    break;
                case 15:
                    str11 = fma.as(parcel, ag);
                    break;
                case 16:
                    str12 = fma.as(parcel, ag);
                    break;
                case 17:
                    str13 = fma.as(parcel, ag);
                    break;
                case 18:
                    strArr = fma.aC(parcel, ag);
                    break;
                case 19:
                    strArr2 = fma.aC(parcel, ag);
                    break;
                case 20:
                    strArr3 = fma.aC(parcel, ag);
                    break;
                case 21:
                    str14 = fma.as(parcel, ag);
                    break;
                case 22:
                    str15 = fma.as(parcel, ag);
                    break;
                case 23:
                    bArr = fma.az(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                    i3 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                    i4 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                    i5 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                    i6 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    str16 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                    str17 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                    str18 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    bundle = fma.al(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                    z = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                    i7 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    i8 = fma.ah(parcel, ag);
                    break;
                case 35:
                    z2 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                    str19 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    str20 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    i9 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                    str21 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                    str22 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                    str23 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                    str24 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_helperText /* 43 */:
                    str25 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                    str26 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                    str27 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) fma.an(parcel, ag, BitmapTeleporter.CREATOR);
                    break;
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                    str28 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                    fileTeleporterArr = (FileTeleporter[]) fma.aB(parcel, ag, FileTeleporter.CREATOR);
                    break;
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    strArr4 = fma.aC(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    z3 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                    str29 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                    themeSettings = (ThemeSettings) fma.an(parcel, ag, ThemeSettings.CREATOR);
                    break;
                case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                    logOptions = (LogOptions) fma.an(parcel, ag, LogOptions.CREATOR);
                    break;
                case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                    str30 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                    z4 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                    bundle2 = fma.al(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                    arrayList = fma.av(parcel, ag, RectF.CREATOR);
                    break;
                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                    z5 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_prefixText /* 59 */:
                    bitmap = (Bitmap) fma.an(parcel, ag, Bitmap.CREATOR);
                    break;
                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                    str31 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                    arrayList2 = fma.au(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                    i10 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                    i11 = fma.ah(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                    strArr5 = fma.aC(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                    strArr6 = fma.aC(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                    strArr7 = fma.aC(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                    z6 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                    z7 = fma.ay(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconTint /* 69 */:
                    str32 = fma.as(parcel, ag);
                    break;
                case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                    additionalConsentConfig = (AdditionalConsentConfig) fma.an(parcel, ag, AdditionalConsentConfig.CREATOR);
                    break;
                case R.styleable.TextInputLayout_suffixText /* 71 */:
                    serviceDumpArr = (ServiceDump[]) fma.aB(parcel, ag, ServiceDump.CREATOR);
                    break;
                default:
                    fma.ax(parcel, ag);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6, z7, str32, additionalConsentConfig, serviceDumpArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 535
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgz.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GoogleCertificatesQuery[i];
            case 1:
                return new GoogleCertificatesLookupResponse[i];
            case 2:
                return new Scope[i];
            case 3:
                return new Status[i];
            case 4:
                return new BitmapTeleporter[i];
            case 5:
                return new DataHolder[i];
            case 6:
                return new ConnectionInfo[i];
            case 7:
                return new ConnectionTelemetryConfiguration[i];
            case 8:
                return new GetServiceRequest[i];
            case 9:
                return new MethodInvocation[i];
            case 10:
                return new ResolveAccountRequest[i];
            case 11:
                return new ResolveAccountResponse[i];
            case 12:
                return new RootTelemetryConfiguration[i];
            case 13:
                return new TelemetryData[i];
            case 14:
                return new FacsCacheCallOptions[i];
            case 15:
                return new ForceSettingsCacheRefreshResult[i];
            case 16:
                return new GetActivityControlsSettingsResult[i];
            case 17:
                return new ReadDeviceLevelSettingsResult[i];
            case 18:
                return new UpdateActivityControlsSettingsResult[i];
            case 19:
                return new ErrorReport[i];
            default:
                return new FileTeleporter[i];
        }
    }
}
