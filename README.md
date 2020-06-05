# MjRangeBar


The MjRangeBar is android RangeBar Graph library that adds some basic material styling, as well as start and end values of range bar,start and end values of Range and item value as floats and some other things using views and Canvas.

**Developers can customize the following attributes (programmatically):**

  - Background Color
  - RangeBar Selected Color
  - RangeBar Stroke Color
  - Magic
  - Min & Max Text Color
  - Value Text Color
  - Circle Color
  - out Of Bound Text Color
  
  **Supported on API Level 15 and above.**

# How to Use
In your project build.gradle. Add the following lines
```Gradle
Allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
In your app build.gradle. Add the following lines
```Gradle
implementation 'com.github.m-jayy:MjRangeBar:0.1.0'
```

# Examples
#### Layout XML
```XML
  <com.mohsin.rangebar_graph.RangeBarGraph
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:layout_gravity="center_horizontal"
        android:paddingBottom="90dp"
        android:adjustViewBounds="true"
        />
```
#### Java
```Java
RangeBarGraph = (RangeBarGraph) findViewById(R.id.RangeBarGraph);
RangeBarGraph.setValues(0.0, 400.0, 130.0, 350.0, 14.0);

//        RangeBarGraph.setRangeBarBackgroundColor("00ffffff");
//        RangeBarGraph.setRangeBarStrokeColor("#eaeaea");
//        RangeBarGraph.setRangeBarSelectedColor("#eaeaea");
//        RangeBarGraph.setRangeBarValueTextColor("#333333");
//        RangeBarGraph.setRangeBarMinMaxTextColor("#333333");
//        RangeBarGraph.setvalueCircleColor("#333333");
//        RangeBarGraph.setoutOfBoundColor("#FF0000");
```

# Plan for Future

 - Better documentation.
 - Kotlin conversion
 - Add more functionality
 

# License
```sh
Copyright 2013, Edmodo, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

```


# Contribution
We'd love for you to participate in the development of our project. So we need all the help we can get. You are always welcome to contribute and help us maintain the library.


