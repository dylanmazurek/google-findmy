package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import com.google.android.gms.nearby.fastpair.internal.RenameDeviceParams;
import com.google.android.gms.nearby.fastpair.internal.UnpairDeviceParams;
import com.google.android.gms.nearby.uwb.internal.ClientDisconnectingParams;
import com.google.android.gms.nearby.uwb.internal.DlTdoaMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.GetLocalAddressParams;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fnq(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        double d = 0.0d;
        long j = 0;
        float f = 0.0f;
        int i = 0;
        String str = null;
        IBinder iBinder = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        Uri uri3 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        String str2 = null;
        Float f2 = null;
        String str3 = null;
        LatLng latLng = null;
        LatLng latLng2 = null;
        switch (this.a) {
            case 0:
                int aj = fma.aj(parcel);
                String[] strArr = null;
                boolean z = false;
                while (parcel.dataPosition() < aj) {
                    int readInt = parcel.readInt();
                    int af = fma.af(readInt);
                    if (af != 2) {
                        if (af != 3) {
                            if (af != 4) {
                                if (af != 5) {
                                    fma.ax(parcel, readInt);
                                } else {
                                    z = fma.ay(parcel, readInt);
                                }
                            } else {
                                i = fma.ah(parcel, readInt);
                            }
                        } else {
                            strArr = fma.aC(parcel, readInt);
                        }
                    } else {
                        str = fma.as(parcel, readInt);
                    }
                }
                fma.aw(parcel, aj);
                return new ServiceDumpRequest(str, strArr, i, z);
            case 1:
                int aj2 = fma.aj(parcel);
                float f3 = 0.0f;
                float f4 = 0.0f;
                while (parcel.dataPosition() < aj2) {
                    int readInt2 = parcel.readInt();
                    int af2 = fma.af(readInt2);
                    if (af2 != 2) {
                        if (af2 != 3) {
                            if (af2 != 4) {
                                if (af2 != 5) {
                                    fma.ax(parcel, readInt2);
                                } else {
                                    f4 = fma.ae(parcel, readInt2);
                                }
                            } else {
                                f3 = fma.ae(parcel, readInt2);
                            }
                        } else {
                            f = fma.ae(parcel, readInt2);
                        }
                    } else {
                        latLng2 = (LatLng) fma.an(parcel, readInt2, LatLng.CREATOR);
                    }
                }
                fma.aw(parcel, aj2);
                return new CameraPosition(latLng2, f, f3, f4);
            case 2:
                int aj3 = fma.aj(parcel);
                double d2 = 0.0d;
                LatLng latLng3 = null;
                ArrayList arrayList = null;
                float f5 = 0.0f;
                int i2 = 0;
                int i3 = 0;
                float f6 = 0.0f;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < aj3) {
                    int readInt3 = parcel.readInt();
                    switch (fma.af(readInt3)) {
                        case 2:
                            latLng3 = (LatLng) fma.an(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d2 = fma.ad(parcel, readInt3);
                            break;
                        case 4:
                            f5 = fma.ae(parcel, readInt3);
                            break;
                        case 5:
                            i2 = fma.ah(parcel, readInt3);
                            break;
                        case 6:
                            i3 = fma.ah(parcel, readInt3);
                            break;
                        case 7:
                            f6 = fma.ae(parcel, readInt3);
                            break;
                        case 8:
                            z2 = fma.ay(parcel, readInt3);
                            break;
                        case 9:
                            z3 = fma.ay(parcel, readInt3);
                            break;
                        case 10:
                            arrayList = fma.av(parcel, readInt3, PatternItem.CREATOR);
                            break;
                        default:
                            fma.ax(parcel, readInt3);
                            break;
                    }
                }
                fma.aw(parcel, aj3);
                return new CircleOptions(latLng3, d2, f5, i2, i3, f6, z2, z3, arrayList);
            case 3:
                int aj4 = fma.aj(parcel);
                LatLng latLng4 = null;
                while (parcel.dataPosition() < aj4) {
                    int readInt4 = parcel.readInt();
                    int af3 = fma.af(readInt4);
                    if (af3 != 2) {
                        if (af3 != 3) {
                            fma.ax(parcel, readInt4);
                        } else {
                            latLng4 = (LatLng) fma.an(parcel, readInt4, LatLng.CREATOR);
                        }
                    } else {
                        latLng = (LatLng) fma.an(parcel, readInt4, LatLng.CREATOR);
                    }
                }
                fma.aw(parcel, aj4);
                return new LatLngBounds(latLng, latLng4);
            case 4:
                int aj5 = fma.aj(parcel);
                double d3 = 0.0d;
                while (parcel.dataPosition() < aj5) {
                    int readInt5 = parcel.readInt();
                    int af4 = fma.af(readInt5);
                    if (af4 != 2) {
                        if (af4 != 3) {
                            fma.ax(parcel, readInt5);
                        } else {
                            d3 = fma.ad(parcel, readInt5);
                        }
                    } else {
                        d = fma.ad(parcel, readInt5);
                    }
                }
                fma.aw(parcel, aj5);
                return new LatLng(d, d3);
            case 5:
                int aj6 = fma.aj(parcel);
                while (parcel.dataPosition() < aj6) {
                    int readInt6 = parcel.readInt();
                    if (fma.af(readInt6) != 2) {
                        fma.ax(parcel, readInt6);
                    } else {
                        str3 = fma.as(parcel, readInt6);
                    }
                }
                fma.aw(parcel, aj6);
                return new MapStyleOptions(str3);
            case 6:
                int aj7 = fma.aj(parcel);
                while (parcel.dataPosition() < aj7) {
                    int readInt7 = parcel.readInt();
                    int af5 = fma.af(readInt7);
                    if (af5 != 2) {
                        if (af5 != 3) {
                            fma.ax(parcel, readInt7);
                        } else {
                            f2 = fma.ap(parcel, readInt7);
                        }
                    } else {
                        i = fma.ah(parcel, readInt7);
                    }
                }
                fma.aw(parcel, aj7);
                return new PatternItem(i, f2);
            case 7:
                int aj8 = fma.aj(parcel);
                LatLng latLng5 = null;
                LatLng latLng6 = null;
                LatLng latLng7 = null;
                LatLng latLng8 = null;
                LatLngBounds latLngBounds = null;
                while (parcel.dataPosition() < aj8) {
                    int readInt8 = parcel.readInt();
                    int af6 = fma.af(readInt8);
                    if (af6 != 2) {
                        if (af6 != 3) {
                            if (af6 != 4) {
                                if (af6 != 5) {
                                    if (af6 != 6) {
                                        fma.ax(parcel, readInt8);
                                    } else {
                                        latLngBounds = (LatLngBounds) fma.an(parcel, readInt8, LatLngBounds.CREATOR);
                                    }
                                } else {
                                    latLng8 = (LatLng) fma.an(parcel, readInt8, LatLng.CREATOR);
                                }
                            } else {
                                latLng7 = (LatLng) fma.an(parcel, readInt8, LatLng.CREATOR);
                            }
                        } else {
                            latLng6 = (LatLng) fma.an(parcel, readInt8, LatLng.CREATOR);
                        }
                    } else {
                        latLng5 = (LatLng) fma.an(parcel, readInt8, LatLng.CREATOR);
                    }
                }
                fma.aw(parcel, aj8);
                return new VisibleRegion(latLng5, latLng6, latLng7, latLng8, latLngBounds);
            case 8:
                int aj9 = fma.aj(parcel);
                while (parcel.dataPosition() < aj9) {
                    int readInt9 = parcel.readInt();
                    int af7 = fma.af(readInt9);
                    if (af7 != 1) {
                        if (af7 != 2) {
                            fma.ax(parcel, readInt9);
                        } else {
                            j = fma.ak(parcel, readInt9);
                        }
                    } else {
                        str2 = fma.as(parcel, readInt9);
                    }
                }
                fma.aw(parcel, aj9);
                return new CallerInfo(str2, j);
            case 9:
                int aj10 = fma.aj(parcel);
                while (parcel.dataPosition() < aj10) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj10);
                return new SyncOptions();
            case 10:
                int aj11 = fma.aj(parcel);
                SyncOptions syncOptions = null;
                while (parcel.dataPosition() < aj11) {
                    int readInt10 = parcel.readInt();
                    int af8 = fma.af(readInt10);
                    if (af8 != 1) {
                        if (af8 != 2) {
                            if (af8 != 3) {
                                fma.ax(parcel, readInt10);
                            } else {
                                syncOptions = (SyncOptions) fma.an(parcel, readInt10, SyncOptions.CREATOR);
                            }
                        } else {
                            bArr4 = fma.az(parcel, readInt10);
                        }
                    } else {
                        i = fma.ah(parcel, readInt10);
                    }
                }
                fma.aw(parcel, aj11);
                return new SyncRequest(i, bArr4, syncOptions);
            case 11:
                int aj12 = fma.aj(parcel);
                while (parcel.dataPosition() < aj12) {
                    int readInt11 = parcel.readInt();
                    if (fma.af(readInt11) != 1) {
                        fma.ax(parcel, readInt11);
                    } else {
                        bArr3 = fma.az(parcel, readInt11);
                    }
                }
                fma.aw(parcel, aj12);
                return new SyncResult(bArr3);
            case 12:
                int aj13 = fma.aj(parcel);
                while (parcel.dataPosition() < aj13) {
                    int readInt12 = parcel.readInt();
                    if (fma.af(readInt12) != 1) {
                        fma.ax(parcel, readInt12);
                    } else {
                        uri3 = (Uri) fma.an(parcel, readInt12, Uri.CREATOR);
                    }
                }
                fma.aw(parcel, aj13);
                return new DeleteFileRequest(uri3);
            case 13:
                int aj14 = fma.aj(parcel);
                while (parcel.dataPosition() < aj14) {
                    int readInt13 = parcel.readInt();
                    int af9 = fma.af(readInt13);
                    if (af9 != 1) {
                        if (af9 != 2) {
                            fma.ax(parcel, readInt13);
                        } else {
                            i = fma.ah(parcel, readInt13);
                        }
                    } else {
                        uri2 = (Uri) fma.an(parcel, readInt13, Uri.CREATOR);
                    }
                }
                fma.aw(parcel, aj14);
                return new OpenFileDescriptorRequest(uri2, i);
            case 14:
                int aj15 = fma.aj(parcel);
                while (parcel.dataPosition() < aj15) {
                    int readInt14 = parcel.readInt();
                    if (fma.af(readInt14) != 1) {
                        fma.ax(parcel, readInt14);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) fma.an(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                fma.aw(parcel, aj15);
                return new OpenFileDescriptorResponse(parcelFileDescriptor);
            case 15:
                int aj16 = fma.aj(parcel);
                Uri uri4 = null;
                while (parcel.dataPosition() < aj16) {
                    int readInt15 = parcel.readInt();
                    int af10 = fma.af(readInt15);
                    if (af10 != 1) {
                        if (af10 != 2) {
                            fma.ax(parcel, readInt15);
                        } else {
                            uri4 = (Uri) fma.an(parcel, readInt15, Uri.CREATOR);
                        }
                    } else {
                        uri = (Uri) fma.an(parcel, readInt15, Uri.CREATOR);
                    }
                }
                fma.aw(parcel, aj16);
                return new RenameRequest(uri, uri4);
            case 16:
                int aj17 = fma.aj(parcel);
                String str4 = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < aj17) {
                    int readInt16 = parcel.readInt();
                    int af11 = fma.af(readInt16);
                    if (af11 != 1) {
                        if (af11 != 2) {
                            if (af11 != 3) {
                                fma.ax(parcel, readInt16);
                            } else {
                                iBinder2 = fma.am(parcel, readInt16);
                            }
                        } else {
                            str4 = fma.as(parcel, readInt16);
                        }
                    } else {
                        bArr2 = fma.az(parcel, readInt16);
                    }
                }
                fma.aw(parcel, aj17);
                return new RenameDeviceParams(bArr2, str4, iBinder2);
            case 17:
                int aj18 = fma.aj(parcel);
                IBinder iBinder3 = null;
                while (parcel.dataPosition() < aj18) {
                    int readInt17 = parcel.readInt();
                    int af12 = fma.af(readInt17);
                    if (af12 != 1) {
                        if (af12 != 2) {
                            fma.ax(parcel, readInt17);
                        } else {
                            iBinder3 = fma.am(parcel, readInt17);
                        }
                    } else {
                        bArr = fma.az(parcel, readInt17);
                    }
                }
                fma.aw(parcel, aj18);
                return new UnpairDeviceParams(bArr, iBinder3);
            case 18:
                int aj19 = fma.aj(parcel);
                while (parcel.dataPosition() < aj19) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj19);
                return new ClientDisconnectingParams();
            case 19:
                int aj20 = fma.aj(parcel);
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                float f7 = 0.0f;
                float f8 = 0.0f;
                int i9 = 0;
                while (parcel.dataPosition() < aj20) {
                    int readInt18 = parcel.readInt();
                    switch (fma.af(readInt18)) {
                        case 1:
                            i4 = fma.ah(parcel, readInt18);
                            break;
                        case 2:
                            i5 = fma.ah(parcel, readInt18);
                            break;
                        case 3:
                            i6 = fma.ah(parcel, readInt18);
                            break;
                        case 4:
                            i7 = fma.ah(parcel, readInt18);
                            break;
                        case 5:
                            i8 = fma.ah(parcel, readInt18);
                            break;
                        case 6:
                            j2 = fma.ak(parcel, readInt18);
                            break;
                        case 7:
                            j3 = fma.ak(parcel, readInt18);
                            break;
                        case 8:
                            f7 = fma.ae(parcel, readInt18);
                            break;
                        case 9:
                            f8 = fma.ae(parcel, readInt18);
                            break;
                        case 10:
                            j4 = fma.ak(parcel, readInt18);
                            break;
                        case 11:
                            j5 = fma.ak(parcel, readInt18);
                            break;
                        case 12:
                            i9 = fma.ah(parcel, readInt18);
                            break;
                        case 13:
                            bArr5 = fma.az(parcel, readInt18);
                            break;
                        case 14:
                            bArr6 = fma.az(parcel, readInt18);
                            break;
                        default:
                            fma.ax(parcel, readInt18);
                            break;
                    }
                }
                fma.aw(parcel, aj20);
                return new DlTdoaMeasurementParams(i4, i5, i6, i7, i8, j2, j3, f7, f8, j4, j5, i9, bArr5, bArr6);
            default:
                int aj21 = fma.aj(parcel);
                while (parcel.dataPosition() < aj21) {
                    int readInt19 = parcel.readInt();
                    if (fma.af(readInt19) != 1) {
                        fma.ax(parcel, readInt19);
                    } else {
                        iBinder = fma.am(parcel, readInt19);
                    }
                }
                fma.aw(parcel, aj21);
                return new GetLocalAddressParams(iBinder);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ServiceDumpRequest[i];
            case 1:
                return new CameraPosition[i];
            case 2:
                return new CircleOptions[i];
            case 3:
                return new LatLngBounds[i];
            case 4:
                return new LatLng[i];
            case 5:
                return new MapStyleOptions[i];
            case 6:
                return new PatternItem[i];
            case 7:
                return new VisibleRegion[i];
            case 8:
                return new CallerInfo[i];
            case 9:
                return new SyncOptions[i];
            case 10:
                return new SyncRequest[i];
            case 11:
                return new SyncResult[i];
            case 12:
                return new DeleteFileRequest[i];
            case 13:
                return new OpenFileDescriptorRequest[i];
            case 14:
                return new OpenFileDescriptorResponse[i];
            case 15:
                return new RenameRequest[i];
            case 16:
                return new RenameDeviceParams[i];
            case 17:
                return new UnpairDeviceParams[i];
            case 18:
                return new ClientDisconnectingParams[i];
            case 19:
                return new DlTdoaMeasurementParams[i];
            default:
                return new GetLocalAddressParams[i];
        }
    }
}
